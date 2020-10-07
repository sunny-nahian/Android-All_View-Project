package com.sunny.viewprojectlistviewgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapterForGrid extends BaseAdapter {

    private LayoutInflater layoutInflater;

    int [] flagsVariable;
    String [] cNamesVariable;
//    int[] colorVariable;
    Context context;

    //create Constructor
    CustomAdapterForGrid(Context context, String[] cNames, int[] icons){
        this.context = context;
        this.cNamesVariable = cNames;
        this.flagsVariable = icons;
//        this.colorVariable = color;
    } // end

    @Override
    public int getCount() {
        return cNamesVariable.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){

            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.sample_for_gridview, viewGroup, false); // for CustomerAdapterForGridView
        }
        // now View ar maddomy sobgulo find korbo
        ImageView imageView = view.findViewById(R.id.idGridImage);
        TextView textView1 = view.findViewById(R.id.idGrifCountryName);

        imageView.setImageResource(flagsVariable[i]);
        textView1.setText(cNamesVariable[i]);

        return view;
    }
}
