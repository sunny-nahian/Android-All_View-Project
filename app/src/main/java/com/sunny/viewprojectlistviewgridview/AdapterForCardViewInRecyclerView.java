package com.sunny.viewprojectlistviewgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterForCardViewInRecyclerView extends RecyclerView.Adapter<AdapterForCardViewInRecyclerView.MyViewHolder> {

    Context context;
    int [] flagsVariable;
    String [] cNamesVariable, cDescVariable;
//create constructor

    public AdapterForCardViewInRecyclerView(Context context, int[] flags, String[] cNames, String[] cDescs) {
        this.context = context;
        this.flagsVariable = flags;
        this.cNamesVariable = cNames;
        this.cDescVariable = cDescs;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //import korte hobe View XML activity ta ke
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_for_recycle_cardview, parent, false);

        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.countryImage.setImageResource(flagsVariable[position]);
        holder.textView1.setText(cNamesVariable[position]);
        holder.textView2.setText(cDescVariable[position]);
    }

    @Override
    public int getItemCount() {
        return cNamesVariable.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView countryImage;
        TextView textView1,textView2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // now View ar maddomy sobgulo find korbo
            countryImage = itemView.findViewById(R.id.idRecycleCardImage);
            textView1 = itemView.findViewById(R.id.idRrCardTitle);
            textView2 = itemView.findViewById(R.id.idRrCardDesc);
        }
    }
}
