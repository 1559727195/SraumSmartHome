package com.massky.sraumsmarthome;

import android.app.Application;

/**
 * Created by zhu on 2017/11/16.
 */

public class ApplicationContext extends Application {
    private static ApplicationContext _instance;
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        _instance = this;
    }


    /**
     *
     * @return
     */
    public static ApplicationContext getInstance(){

        return _instance;
    }


    public void init () {

    }

}
