package com.Tamazj.TamazjApp.Adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.Tamazj.TamazjApp.Fragments.CategoriesdetailsFragment;
import com.Tamazj.TamazjApp.Model.AdvisoeDeailsBottomDialog;
import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.Model.Areas_Counseling_Model;
import com.Tamazj.TamazjApp.Model.Categories;
import com.Tamazj.TamazjApp.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyHolder>{

    private List<Categories> categories;
    private Context context;
    private LayoutInflater inflater;
    int pos;

    interface IClickListener{
        void onItemClick(int position,List<Areas_Counseling_Model> areas_counseling_models, View enable);
    }

    Areas_Counseling_adapter.IClickListener iClickListener;

    public CategoriesAdapter(Context context, List<Categories> categories){
        this.categories = categories;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CategoriesAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.categoriesdetailsitem,parent,false);
        CategoriesAdapter.MyHolder holder = new CategoriesAdapter.MyHolder(view);
        return holder;
    }

    boolean isClickable;

    @Override
    public void onBindViewHolder(@NonNull final CategoriesAdapter.MyHolder holder, final int position) {
        Picasso.with(context)
                .load(categories.get(position).getProfileimage())
                .error(R.drawable.image)

                .into(holder.profileimage);

        holder.percent.setText(categories.get(position).getPercent());
        holder.profile_dsc.setText(categories.get(position).getProfile_dsc());
        holder.profile_name.setText(categories.get(position).getProfile_name());
        holder.catoroytype.setText(categories.get(position).getCatoroytype());
        holder.askasteschar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdvisoeDeailsBottomDialog advisoeDeailsBottomDialog = new AdvisoeDeailsBottomDialog();
                Bundle bundle = new Bundle();
                bundle.putString(AppConstants.ADVISOR_ID, categories.get(position).getId());
                advisoeDeailsBottomDialog.setArguments(bundle);
                //advisoeDeailsBottomDialog.show((BottomSheetDialogFragment)context).getFragmentManager(), advisoeDeailsBottomDialog.getTag());

            }
        });

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new CategoriesdetailsFragment();
                Bundle bundle = new Bundle();
                bundle.putString(AppConstants.CATEGORY_ID, categories.get(position).getCategoryId());
                bundle.putString(AppConstants.toolbartiltle, categories.get(position).getCatoroytype());
                fragment.setArguments(bundle);
                ((FragmentActivity)context).getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, fragment, "HomeFragment").commit();


            }
        });


    }



    @Override
    public int getItemCount() { return
            categories.size(); }

    class MyHolder extends RecyclerView.ViewHolder  {

        ImageView profileimage;
        TextView percent;
        TextView profile_name;
        TextView profile_dsc;
        TextView catoroytype;
        CardView cardView;
        ImageView askasteschar;


        public MyHolder(View itemView) {
            super(itemView);
            percent = itemView.findViewById(R.id.percent);
            profileimage = itemView.findViewById(R.id.profileimage);
            profile_name = itemView.findViewById(R.id.profile_name);
            profile_dsc = itemView.findViewById(R.id.profile_dsc);
            catoroytype = itemView.findViewById(R.id.catoroytype);
            cardView = itemView.findViewById(R.id.cardview);
            askasteschar = itemView.findViewById(R.id.imageView3);




        }

    }
}

