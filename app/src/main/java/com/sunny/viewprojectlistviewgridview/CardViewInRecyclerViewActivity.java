package com.sunny.viewprojectlistviewgridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CardViewInRecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] cNames, cDesc;
    int [] flags = {R.drawable.bangladesh, R.drawable.india, R.drawable.pakistan, R.drawable.brazil,
            R.drawable.france,R.drawable.portugal,R.drawable.italy,R.drawable.argentina,R.drawable.germany,
    };
    AdapterForCardViewInRecyclerView myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_in_recycler_view);

        recyclerView = findViewById(R.id.idCardInsideRecycler);
        cNames = getResources().getStringArray(R.array.Country_name); //String Resources theke data anbo
        cDesc = getResources().getStringArray(R.array.Country_desc); //String Resources theke data anbo

        myadapter = new AdapterForCardViewInRecyclerView(this,flags,cNames,cDesc);

        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
