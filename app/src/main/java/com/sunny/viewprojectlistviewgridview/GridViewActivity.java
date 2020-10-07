package com.sunny.viewprojectlistviewgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity {
    GridView gridView;

    String [] title;
    int [] icons ={R.drawable.chrome, R.drawable.facebook, R.drawable.whatsapp, R.drawable.youtube, R.drawable.messenger, R.drawable.instagram,
            R.drawable.skype, R.drawable.linkedin, R.drawable.twitter, R.drawable.twit, R.drawable.viber, R.drawable.twitter1,R.drawable.snapchat};

//    int color[] = {R.color.yellow_green, R.color.blue,R.color._light_green,R.color.orange_red, R.color.brown, R.color.black,
//            R.color.sky_blue,R.color.deep_sky_blue,R.color.light_sky_blue,R.color.maroon,R.color.hot_pink,R.color.sea_green,R.color.yellow};

    CustomAdapterForGrid adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Social Media");
        setContentView(R.layout.activity_grid_view);

        title = getResources().getStringArray(R.array.Social_name); // country name gula anlam String file theke

        gridView = findViewById(R.id.idGridView);


        adapter = new CustomAdapterForGrid(this, title,icons);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = title[i];
                Toast.makeText(GridViewActivity.this, value+ " " +i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
