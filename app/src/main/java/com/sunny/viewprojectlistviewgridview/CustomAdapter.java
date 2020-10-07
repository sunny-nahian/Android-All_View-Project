package com.sunny.viewprojectlistviewgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;

    int [] flagsVariable;
    String [] cNamesVariable, cDescVariable;
    Context context;

    //create Constructor
    CustomAdapter (Context context, String[] cNames, String[] cDesc, int [] flags){
        this.context = context;
        this.cNamesVariable = cNames;
        this.cDescVariable = cDesc;
        this.flagsVariable = flags;
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
          view = layoutInflater.inflate(R.layout.sample_for_customadapter, viewGroup, false); // for CustomerAdapter
        }
        // now View ar maddomy sobgulo find korbo
       ImageView imageView = view.findViewById(R.id.idImageView);
        TextView textView1 = view.findViewById(R.id.idCountryName);
        TextView textView2 = view.findViewById(R.id.idDesc);

        imageView.setImageResource(flagsVariable[i]);
        textView1.setText(cNamesVariable[i]);
        textView2.setText(cDescVariable[i]);

        return view;
    }
}
