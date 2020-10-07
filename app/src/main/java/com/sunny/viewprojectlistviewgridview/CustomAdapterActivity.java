package com.sunny.viewprojectlistviewgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class CustomAdapterActivity extends AppCompatActivity {
    CustomAdapter adapter;
    ListView listView;
    String[] cNames, cDesc;
    int [] flags = {R.drawable.bangladesh, R.drawable.india, R.drawable.pakistan, R.drawable.brazil,
            R.drawable.france,R.drawable.portugal,R.drawable.italy,R.drawable.argentina,R.drawable.germany,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        cNames = getResources().getStringArray(R.array.Country_name); //String Resources theke data anbo
        cDesc = getResources().getStringArray(R.array.Country_desc); //String Resources theke data anbo

        listView = findViewById(R.id.idListviewLayout2);

        //Creating CustomListview
        adapter = new CustomAdapter(this,cNames,cDesc,flags);
        listView.setAdapter(adapter);

        //for listener adding
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = cNames[i]; // user which Item select
                Toast.makeText(CustomAdapterActivity.this, value , Toast.LENGTH_SHORT).show();
            }
        });


    }


    //for appbar SearchView
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);

        //now SearchView Filttering
        MenuItem menuItem = menu.findItem(R.id.app_bar_searchId);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

//                adapter.getFilter().filter(s);


                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
