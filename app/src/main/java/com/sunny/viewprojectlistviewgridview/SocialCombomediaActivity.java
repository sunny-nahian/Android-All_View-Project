package com.sunny.viewprojectlistviewgridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

public class SocialCombomediaActivity extends AppCompatActivity {
    GridView gridView;

    String [] title;
    int [] icons ={R.drawable.chrome, R.drawable.facebook, R.drawable.whatsapp, R.drawable.youtube, R.drawable.messenger, R.drawable.instagram,
            R.drawable.skype, R.drawable.linkedin, R.drawable.twitter, R.drawable.twit, R.drawable.viber, R.drawable.twitter1,R.drawable.snapchat};
    int color[] = {R.color.yellow_green, R.color.blue,R.color._light_green,R.color.orange_red, R.color.brown, R.color.black,
            R.color.sky_blue,R.color.deep_sky_blue,R.color.light_sky_blue,R.color.maroon,R.color.hot_pink,R.color.sea_green,R.color.yellow};

    AdapterForSocialCombo adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Social ComboMedia");
        setContentView(R.layout.activity_social_combomedia);

        title = getResources().getStringArray(R.array.Social_name); // country name gula anlam String file theke
        gridView = findViewById(R.id.idSocialGridView);

        adapter = new AdapterForSocialCombo(this, icons, color, title);
        gridView.setAdapter(adapter);
    }
}
