package com.sunny.viewprojectlistviewgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;
    String[] cNames;
    ArrayAdapter<String> arrayAdapter;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.idListviewLayout);
        searchView = findViewById(R.id.idSearchView);

        //ArrayAdapter
        // Convert StringArray(resources file) to Java File
        cNames = getResources().getStringArray(R.array.Country_name); // end

        //Create ArrayAdapter
        arrayAdapter = new ArrayAdapter<String>(ListViewActivity.this, R.layout.sample_for_listview, R.id.idTextView, cNames);
        // set adapter on listview
        listView.setAdapter(arrayAdapter); // end
        //ArrayAdapter end

        //listview e Onclick set
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = cNames[i];  // for item get from listview
                Toast.makeText(ListViewActivity.this, value+ " " +i, Toast.LENGTH_SHORT).show();
            }
        });
        //for SearchView
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        }); // end Searchview

    }
}
