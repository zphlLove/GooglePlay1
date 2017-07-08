package com.itheima.googleplay.utils;

import android.content.Context;
import android.content.res.Resources;

import com.itheima.googleplay.bases.MyApplication;

/**
 * Created by zp on 2017/7/8.
 */

public class UIUtils {
    public static Context getContext(){
        return MyApplication.getContext();
    }

    public static Resources getResources(){
        return getContext().getResources();
    }
    public static String getString(int resid){
        return getResources().getString(resid);
    }
    public static String[]getStrings(int resid){
        return getResources().getStringArray(resid);

    }
    public static int getColor(int resid){
        return getResources().getColor(resid);

    }
    public static String getPackageName(){
        return getContext().getPackageName();
    }
}
