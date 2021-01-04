package com.example.mmvp.app;

import android.app.Application;




public class MyApp extends Application  {
    public static MyApp app;
    private static String[] modules = {"com.live.MyApplication"};
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

}
