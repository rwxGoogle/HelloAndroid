package com.example.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.helloandroid.data.DataSource;
import com.example.helloandroid.adapters.RecyclerViewAdapter;

import java.util.List;

/**
 * Created by roxanan on 03,April,2019
 */
public class W4CarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);

        // Get the data source
        DataSource dataSource = new DataSource();
        List<String> carList = dataSource.getCars();

        // Initialize recycler view
        RecyclerView recyclerView = findViewById(R.id.carListView);

        //Initialize the linear layout manager -> handles organization of UI components in a View
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        // Set linear layout manager to recycler view
        recyclerView.setLayoutManager(layoutManager);

        // Initialize recycler view adapter with car list (data source)
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(carList);

        // Set recycler view adapter to recycler view
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
