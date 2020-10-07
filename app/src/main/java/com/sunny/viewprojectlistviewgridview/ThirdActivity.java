package com.sunny.viewprojectlistviewgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    Button listviewbtn, customadapter, gridviewbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        listviewbtn = findViewById(R.id.idListView);
        customadapter =  findViewById(R.id.idCustonAdapterView);
        gridviewbtn = findViewById(R.id.idGridView);

        listviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        customadapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, CustomAdapterActivity.class);
                startActivity(intent);
            }
        });
        gridviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
