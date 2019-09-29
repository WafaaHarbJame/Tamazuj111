package com.Tamazj.TamazjApp.Adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.Tamazj.TamazjApp.Model.PayWayImage;
import com.Tamazj.TamazjApp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PayWayAdapter  extends RecyclerView.Adapter<PayWayAdapter.MyHolder> {

    public interface IClickListener{
        void onItemClick(int position,PayWayImage payWayImage);
    }

    IClickListener iClickListener;
    public void setiClickListener(IClickListener iClickListener) {
        this.iClickListener = iClickListener;
    }

    MyHolder holder;
    String sessionType;
    private final List<PayWayImage> imageViews;
    final Context context;
    private LayoutInflater inflater;
    public PayWayAdapter(Context context, List<PayWayImage> imageViews){
        this.imageViews = imageViews;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        //this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public PayWayAdapter(Context context, List<PayWayImage> imageViews, String sessionType){
        this.imageViews = imageViews;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.sessionType = sessionType;
        //this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.pay_way_image_layout,parent,false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {
        this.holder = holder;
        if (!(imageViews.isEmpty())) {
            Picasso.with(context).load(getURLForResource(imageViews.get(position).getImgResource())).into(holder.img);
        }

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(iClickListener !=null){
                    iClickListener.onItemClick(position,imageViews.get(position));
                }
            }
        });
    }
    public String getURLForResource (int resourceId) {
        return Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +resourceId).toString();
    }

    @Override
    public int getItemCount() {
        return imageViews.size();
    }

    static class MyHolder extends RecyclerView.ViewHolder  {
     //implements  View.OnClickListener
        ImageView img;

        public MyHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.payWayImage);
            //img.setOnClickListener(this);
            this.setIsRecyclable(false);
        }

//        @Override
//        public void onClick(View v) {
//            if(v == img){
////                Bundle bundle = new Bundle();
////                bundle.putString(AppConstants.SESSION_TYPE, sessionType);
////                getSupportFragmentManager().beginTransaction().replace(R.id.billContainer, new SuccessPayFragment(), "SuccessPayFragment").commit();
////
//            }
 //       }

    }


}
