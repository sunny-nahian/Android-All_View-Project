package com.sunny.viewprojectlistviewgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private static ClickListener clickListener; // for clinking part

    Context context;
    int [] flagsVariable;
    String [] cNamesVariable, cDescVariable;
//create constructor


    public RecyclerViewAdapter(Context context, int[] flags, String[] cNames, String[] cDesc) {
        this.context = context;
        this.flagsVariable = flags;
        this.cNamesVariable = cNames;
        this.cDescVariable = cDesc;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //import korte hobe View XML activity ta ke
        LayoutInflater layoutInflater = LayoutInflater.from(context);
       View view = layoutInflater.inflate(R.layout.sample_for_recyclerview, parent, false);

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

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        ImageView countryImage;
        TextView textView1,textView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // now View ar maddomy sobgulo find korbo
            countryImage = itemView.findViewById(R.id.idRecyclerImageView);
             textView1 = itemView.findViewById(R.id.idTitleName);
             textView2 = itemView.findViewById(R.id.idRecyclerDesc);

             itemView.setOnClickListener(this);  //set listener
            itemView.setOnLongClickListener(this); //set listener

        }

        @Override
        public void onClick(View view) {
        clickListener.onItemClick(getAdapterPosition(), view);
        }

        @Override
        public boolean onLongClick(View view) {
            clickListener.onItemLongClick(getAdapterPosition(), view);
            return false;
        }
    }
    // for cliking Part (Method adding)
    public interface ClickListener{

        void onItemClick(int position, View view );
        void onItemLongClick(int position, View view );
    }

    //create onItemClick Listener Which we call by MainActivity
    public void setOnItemClickListener(ClickListener clickListener){
        RecyclerViewAdapter.clickListener = clickListener;
    } // END for cliking Part (Method adding)

}
