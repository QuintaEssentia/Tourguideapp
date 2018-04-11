package com.example.android.tourguide_moscow_ni;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlacePageAdapter extends FragmentPagerAdapter {
    private Context mContext;

    //Public constructor for the ViewPager Adapter
    public PlacePageAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        //Set the Fragments as ViewPager items
        //And else is required!!
        if (position == 0) {
            return new YaroslavlFragment();
        } else {
            if (position == 1)
                return new SuzdalFragment();

            else {
                if (position == 2)
                    return new KostromaFragment();
                else {
                    return new VladimirFragment();
                }

            }
        }



    }



        @Override
        public int getCount() {

            //Returns the number of items of the Viewpager
            return 4;
        }


    @Override
    public CharSequence getPageTitle(int position) {
        //Set the titles of the tabs for the TabLayout
        if (position == 0) {
            return mContext.getString(R.string.category_yaroslavl);
        } else if (position == 1) {
            return mContext.getString(R.string.category_suzdal);
        } else if (position == 2) {
            return mContext.getString(R.string.category_kostroma);
        } else {
            return mContext.getString(R.string.category_vladimir);
        }
    }
}
