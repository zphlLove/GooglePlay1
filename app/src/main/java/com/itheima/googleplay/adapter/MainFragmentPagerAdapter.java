package com.itheima.googleplay.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.itheima.googleplay.factory.FragmentFactory;
import com.itheima.googleplay.utils.LogUtils;

/**
 * Created by zp on 2017/7/9.
 */

public class MainFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private final String[] mTitles;

    public MainFragmentPagerAdapter(FragmentManager fm, String[]mTitles) {
        super(fm);
        this.mTitles=mTitles;
    }


    @Override
    public Fragment getItem(int position) {
        LogUtils.s("初始化"+mTitles[position]);
        Fragment fragment = FragmentFactory.createFragment(position);
        return fragment;
    }

    @Override
    public int getCount() {
        if(mTitles!=null){
            return mTitles.length;

        }
        return 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return mTitles[position];
    }
}
