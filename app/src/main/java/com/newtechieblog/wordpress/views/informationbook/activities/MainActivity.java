package com.newtechieblog.wordpress.views.informationbook.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.newtechieblog.wordpress.views.informationbook.R;
import com.newtechieblog.wordpress.views.informationbook.adapters.AdapterClass;
import com.newtechieblog.wordpress.views.informationbook.models.ModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arrayList;
    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        arrayList = new ArrayList<>();

        ModelClass countries = new ModelClass("countries", "The Countries");
        ModelClass leaders = new ModelClass("leaders","The Leaders");
        ModelClass museums = new ModelClass("museums", "The Museums");
        ModelClass wonders = new ModelClass("wonders", "Seven wonders of the World");

        arrayList.add(countries);
        arrayList.add(leaders);
        arrayList.add(museums);
        arrayList.add(wonders);

        adapter = new AdapterClass(arrayList, this);
        recyclerView.setAdapter(adapter);

    }
}