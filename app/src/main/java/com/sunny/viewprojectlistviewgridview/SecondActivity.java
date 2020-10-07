package com.sunny.viewprojectlistviewgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button cardinsiderecyclebtn, secondbtn ,recyclerbtn, socialComboBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondbtn = findViewById(R.id.idGo2);
        recyclerbtn = findViewById(R.id.idRecyclerViewButton);
        cardinsiderecyclebtn = findViewById(R.id.idBtnCardRecycler);
        socialComboBtn = findViewById(R.id.idBtnforSocialCombomedia);

        cardinsiderecyclebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, CardViewInRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        secondbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        recyclerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        socialComboBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, SocialCombomediaActivity.class);
                startActivity(intent);
            }
        });
    }
}
