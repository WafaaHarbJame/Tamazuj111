package com.Tamazj.TamazjApp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Tamazj.TamazjApp.Activity.BillActivity;
import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.Model.RequestConsultation;
import com.Tamazj.TamazjApp.Model.Session;
import com.Tamazj.TamazjApp.R;

import java.util.List;

public class SessionAdapter extends RecyclerView.Adapter<SessionAdapter.MyHolder>{

    private List<Session.DataBean> sessionlist;
    private Context context;
    private LayoutInflater inflater;
    int pos;
    String categoryId, subCategoryId, category, advisorId, lang, token;

    public SessionAdapter(Context context, List<Session.DataBean> sessionlist,
                          String categoryId, String category, String subCategoryId,
                          String advisor_id, String lang, String token) {
        this.lang = lang;
        this.token = token;
        this.categoryId = categoryId;
        this.category = category;
        this.subCategoryId = subCategoryId;
        this.advisorId = advisor_id;
        this.sessionlist = sessionlist;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    interface IClickListener{
        void onItemClick(int position,List<Session> sessionlist);
    }

    IClickListener iClickListener;

    public void setIClickListener(IClickListener iClickListener){
        this.iClickListener=iClickListener;
    }

    public SessionAdapter(Context context, List<Session.DataBean> sessionlist){
        this.sessionlist = sessionlist;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public SessionAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.session_item,parent,false);
        SessionAdapter.MyHolder holder = new SessionAdapter.MyHolder(view);
        return holder;
    }

    boolean isClickable;

    @Override
    public void onBindViewHolder(@NonNull final SessionAdapter.MyHolder holder, final int position) {

        holder.session_time_price.setText(sessionlist.get(position).getPrice()+"  "+context.getString(R.string.currancy)+"     "+"-"+"     "+sessionlist.get(position).getTime());
        holder.session_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(context, BillActivity.class);
                intent.putExtra(AppConstants.SESSION_TYPE, sessionlist.get(position).getId());
                intent.putExtra(AppConstants.CONSULT_TYPE, category);
                intent.putExtra(AppConstants.CATEGORY_ID, categoryId);
                intent.putExtra(AppConstants.Sub_CATEGORY_ID, subCategoryId);
                intent.putExtra(AppConstants.ADVISOR_ID, advisorId);
                RequestConsultation requestConsultation = new RequestConsultation();
                String message = requestConsultation.requestConsultation("video", "",  sessionlist.get(position).getId(), categoryId,
                        advisorId, subCategoryId, "4", lang, token, context);
                if(message.matches(AppConstants.SUCCESS))
                context.startActivity(intent);
                else Toast.makeText(context, ""+context.getString(R.string.tryAgain), Toast.LENGTH_SHORT).show();
            }
        });


    }



    @Override
    public int getItemCount() { return sessionlist.size(); }

    class MyHolder extends RecyclerView.ViewHolder  {

        ImageView session_image;
        TextView session_time_price;

        public MyHolder(View itemView) {
            super(itemView);
            session_image = itemView.findViewById(R.id.session_image);
            session_time_price = itemView.findViewById(R.id.session_time_price);


        }

    }
}
