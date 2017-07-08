package com.itheima.googleplay;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.astuetz.PagerSlidingTabStrip;
import com.astuetz.PagerSlidingTabStripExtends;
import com.itheima.googleplay.adapter.MainFragmentPagerAdapter;
import com.itheima.googleplay.utils.UIUtils;

public class MainActivity extends AppCompatActivity {

    private android.support.v4.widget.DrawerLayout mdrawlayout;
    private ActionBarDrawerToggle mToggle;
    private com.astuetz.PagerSlidingTabStripExtends mtabs;
    private android.support.v4.view.ViewPager mviewpager;
    private String[] mMainTitles;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mviewpager = (ViewPager) findViewById(R.id.main_viewpager);
        this.mtabs = (PagerSlidingTabStripExtends) findViewById(R.id.main_tabs);
        this.mdrawlayout = (DrawerLayout) findViewById(R.id.main_drawlayout);
        initActionBar();
        initActionBarToggle();
        initDatas();
    }

    private void initDatas() {


        mMainTitles = UIUtils.getStrings(R.array.main_titles);
        MainFragmentPagerAdapter adapter = new MainFragmentPagerAdapter(getSupportFragmentManager(),mMainTitles);
        mviewpager.setAdapter(adapter);
        mtabs.setViewPager(mviewpager);

    }

    private void initActionBarToggle() {
        mToggle = new ActionBarDrawerToggle(this, mdrawlayout, R.string.open, R.string.close);
        mToggle.syncState();
        mdrawlayout.addDrawerListener(mToggle);
    }

    private void initActionBar() {
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setTitle("Google Play");
        supportActionBar.setDisplayShowHomeEnabled(true);
        supportActionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                mToggle.onOptionsItemSelected(item);

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
