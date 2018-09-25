package com.example.android.cracowguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter  extends FragmentPagerAdapter {
    private Context context;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;

    }



    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new ParkFragment();
        } else {
            return new EatingFragment();
        }
    }



    @Override
    public int getCount() {
        return 4;
    }



    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_places);
        } else if (position == 1) {
            return context.getString(R.string.category_museums);
        } else if (position == 2) {
            return context.getString(R.string.category_park);
        } else {
            return context.getString(R.string.category_eating);
        }
    }
}





