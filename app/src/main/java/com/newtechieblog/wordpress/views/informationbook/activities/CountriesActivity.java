package com.newtechieblog.wordpress.views.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.newtechieblog.wordpress.views.informationbook.R;
import com.newtechieblog.wordpress.views.informationbook.adapters.ViewPagerAdapterCountries;

public class CountriesActivity extends AppCompatActivity {

    private TabLayout tabLayoutUnitedKingdom;
    private ViewPager2 viewPagerUnitedKingdom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        tabLayoutUnitedKingdom = findViewById(R.id.tabLayoutUnitedKingdom);
        viewPagerUnitedKingdom = findViewById(R.id.viewPagerUnitedKingdom);

        ViewPagerAdapterCountries adapter = new ViewPagerAdapterCountries(getSupportFragmentManager(), getLifecycle());

        viewPagerUnitedKingdom.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutUnitedKingdom, viewPagerUnitedKingdom,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("United Kingdom");
                        break;
                }
            }
        });

        tabLayoutMediator.attach();
    }
}