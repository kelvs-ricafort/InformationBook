package com.newtechieblog.wordpress.views.informationbook.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.newtechieblog.wordpress.views.informationbook.R;
import com.newtechieblog.wordpress.views.informationbook.models.ModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        arrayList = new ArrayList<>();

        ModelClass countries = new ModelClass(R.string.countries, R.string.countries_category);
        ModelClass leaders = new ModelClass(R.string.leaders, R.string.leaders_category);
        ModelClass museums = new ModelClass(R.string.museums, R.string.museums_category);
        ModelClass wonders = new ModelClass(R.string.wonders, R.string.wonders_category);

        arrayList.add(countries);
        arrayList.add(leaders);
        arrayList.add(museums);
        arrayList.add(wonders);




    }
}