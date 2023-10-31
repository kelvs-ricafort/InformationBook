package com.newtechieblog.wordpress.views.informationbook.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.newtechieblog.wordpress.views.informationbook.fragments.FragmentUnitedKingdom;

public class ViewPagerAdapterCountries extends FragmentStateAdapter {
    public ViewPagerAdapterCountries( FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch (position) {
            case 0:
                fragment = FragmentUnitedKingdom.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 1;
    }


}
