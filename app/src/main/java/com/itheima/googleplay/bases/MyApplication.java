package com.itheima.googleplay.bases;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Process;

/**
 * Created by zp on 2017/7/8.
 */

public class MyApplication extends Application {

    private static Context mContext;
    private static Handler mMainThreadHandler;
    private static int mMainThreadId;

    @Override
    public void onCreate() {

        mContext = getApplicationContext();
        mMainThreadHandler = new Handler();
        mMainThreadId = Process.myTid();

        super.onCreate();
    }
    public static Context getContext(){
        return mContext;
    }
    public static Handler getHandler(){
        return mMainThreadHandler;
    }
    public static int getId(){
        return mMainThreadId;
    }
}
