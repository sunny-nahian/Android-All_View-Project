package com.sunny.viewprojectlistviewgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterForSocialCombo extends BaseAdapter {
    private LayoutInflater layoutInflater;

    int [] icons , color;
    String [] title;
    Context context;
    //create Constructor


    public AdapterForSocialCombo(Context context, int[] icons, int[] color, String[] title ) {
        this.context = context;
        this.icons = icons;
        this.color = color;
        this.title = title;

    }

    @Override
    public int getCount() {
        return title.length;
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
            view = layoutInflater.inflate(R.layout.sample_for_socialcombomedia, viewGroup, false); // for CustomerAdapterForGridView
        }
        // now View ar maddomy sobgulo find korbo
        ImageView imageView = view.findViewById(R.id.idSocialGridImage);
        TextView textView1 = view.findViewById(R.id.idSocialGrifCountryName);

        imageView.setImageResource(icons[i]);
        textView1.setText(title[i]);

        return view;
    }
}