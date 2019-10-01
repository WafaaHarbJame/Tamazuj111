package com.Tamazj.TamazjApp.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.Tamazj.TamazjApp.Fragments.CategoriesdetailsFragment;
import com.Tamazj.TamazjApp.Fragments.SubCategoriesDetailsFragment;
import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.Model.Areas_Counseling_Model;
import com.Tamazj.TamazjApp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SupCategoriesAdapter extends RecyclerView.Adapter<SupCategoriesAdapter.MyHolder>{

    private List<Areas_Counseling_Model> areas_counseling_models;
    private Context context;
    private LayoutInflater inflater;
    int pos;

    interface IClickListener{
        void onItemClick(int position, List<Areas_Counseling_Model> areas_counseling_models, View enable);
    }

    IClickListener iClickListener;

    public SupCategoriesAdapter(Context context, List<Areas_Counseling_Model> areas_counseling_models){
        this.areas_counseling_models = areas_counseling_models;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.areas_counseling_item,parent,false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    boolean isClickable;

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, final int position) {
       Picasso.with(context)
              .load(areas_counseling_models.get(position).getArea_counseling_image())
               .error(R.drawable.asteshartnafsi)

               .into(holder.area_counseling_image);

        holder.area_counseling_catogory.setText(areas_counseling_models.get(position).getArea_counseling_catogory());
       holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                bundle.putString(AppConstants.toolbartiltle, areas_counseling_models.get(position).getArea_counseling_catogory());
                bundle.putString(AppConstants.CATEGORY_ID, areas_counseling_models.get(position).getId());
                //Toast.makeText(context, ""+ areas_counseling_models.get(position).getId(), Toast.LENGTH_SHORT).show();
                Fragment categoriesdetailsFragment=new SubCategoriesDetailsFragment();
                categoriesdetailsFragment.setArguments(bundle);
                ((FragmentActivity)context).getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, categoriesdetailsFragment, "HomeFragment").commit();

            }
        });


    }



    @Override
    public int getItemCount() { return areas_counseling_models.size(); }

    class MyHolder extends RecyclerView.ViewHolder  {

        CircleImageView area_counseling_image;
        TextView area_counseling_catogory;
        LinearLayout linearLayout;

        public MyHolder(View itemView) {
            super(itemView);
            area_counseling_image = itemView.findViewById(R.id.area_counseling_image);
            area_counseling_catogory = itemView.findViewById(R.id.area_counseling);
           linearLayout=itemView.findViewById(R.id.linearLayout);


        }

    }
}
