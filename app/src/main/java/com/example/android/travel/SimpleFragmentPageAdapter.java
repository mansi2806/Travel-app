package com.example.android.travel;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Mansi on 2/12/2017.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter{

    private String[] tabTitles={"M1","M2","M3"};

    public SimpleFragmentPageAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new m1Fragment();
        else if(position==1)
            return new m2Fragment();
        else
            return new m3Fragment();

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
