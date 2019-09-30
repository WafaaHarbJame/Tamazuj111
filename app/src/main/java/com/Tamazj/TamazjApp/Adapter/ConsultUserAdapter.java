package com.Tamazj.TamazjApp.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.Model.Consults;
import com.Tamazj.TamazjApp.R;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Locale;

public class ConsultUserAdapter extends RecyclerView.Adapter<ConsultUserAdapter.MyHolder> {

    final Context context;
    private final List<Consults.DataBean> consults;
    MyHolder holder;
    private LayoutInflater inflater;
    SharedPreferences sharedPreferences;
    String lang;


    public ConsultUserAdapter(Context context, List<Consults.DataBean> consults) {
        this.consults = consults;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.advisor_constluct_layout, parent, false);
        MyHolder holder = new MyHolder(view);
        if (sharedPreferences != null && sharedPreferences.getString(AppConstants.LANG_choose, Locale.getDefault().getLanguage()) != null) {
            lang = sharedPreferences.getString(AppConstants.LANG_choose, Locale.getDefault().getLanguage());
        } else {
            lang = Locale.getDefault().getLanguage();
        }
        return holder;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {
        this.holder = holder;
            holder.name.setText(consults.get(position).getConsultant_id().getName());
        holder.consultStatusFinished.setText(consults.get(position).getStatus());
            holder.time.setText(consults.get(position).getSession_time().getTime());
           /* if (lang.matches("ar")) {
                if(consults.get(position).getCategory_id().getName_ar()!=null) {
                    holder.type.setText(consults.get(position).getCategory_id().getName_ar());
                }

            } else  if(consults.get(position).getCategory_id().getName_en()!=null){

                holder.type.setText(consults.get(position).getCategory_id().getName_en());

            }*/


        Picasso.with(context).
                load(consults.get(position).getConsultant_id().getPhoto()).
                error(R.drawable.image).resize(90, 100).into(holder.img);

    }

    public String getURLForResource(int resourceId) {
        return Uri.parse("android.resource://" + R.class.getPackage().getName() + "/" + resourceId).toString();
    }

    @Override
    public int getItemCount() {
        return consults.size();
    }

    static class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name, type, time, consultStatusFinished, consultStatusScheduled;
        ImageView img;
        ViewGroup container;

        public MyHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvConsultName);
            type = itemView.findViewById(R.id.tvConsultType);
            time = itemView.findViewById(R.id.tvConsultTime);
            consultStatusFinished = itemView.findViewById(R.id.tvConsultStatus);
            consultStatusScheduled = itemView.findViewById(R.id.tvConsultStatusScheduled);
            img = itemView.findViewById(R.id.consultImage);
            container = itemView.findViewById(R.id.cardViewConsult);
            container.setOnClickListener(this);
            this.setIsRecyclable(false);
        }

        @Override
        public void onClick(View v) {
            if (v == container) {

            }
        }

    }


}
