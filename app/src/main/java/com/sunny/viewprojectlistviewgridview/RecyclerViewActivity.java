package com.sunny.viewprojectlistviewgridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] cNames, cDesc;
    int [] flags = {R.drawable.bangladesh, R.drawable.india, R.drawable.pakistan, R.drawable.brazil,
            R.drawable.france,R.drawable.portugal,R.drawable.italy,R.drawable.argentina,R.drawable.germany,
    };
    RecyclerViewAdapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Recycler View");
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.idrecyclerView);
        cNames = getResources().getStringArray(R.array.Country_name); //String Resources theke data anbo
        cDesc = getResources().getStringArray(R.array.Country_desc); //String Resources theke data anbo

        myadapter = new RecyclerViewAdapter(this,flags,cNames,cDesc);

        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //clicking part
     myadapter.setOnItemClickListener(new RecyclerViewAdapter.ClickListener() {
         @Override
         public void onItemClick(int position, View view) {
             String value = cNames[position]; // user which Item select
             Toast.makeText(RecyclerViewActivity.this, value , Toast.LENGTH_LONG).show();
         }

         @Override
         public void onItemLongClick(int position, View view) {
             String value = cNames[position]; // user which Item select
             Toast.makeText(RecyclerViewActivity.this,"OnItenLongClick :"+" " +value , Toast.LENGTH_LONG).show();
         }
     });

    }
}
