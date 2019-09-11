package com.mma.basicappupdate;

import android.app.*;
import android.os.*;
import android.widget.*;

import nnl.aide.appupdate.AppUpdater;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AppUpdater updater=new AppUpdater(this);
        updater.check("http://video.suboonews.com/indiamovieupdate.html",

                new AppUpdater.AppUpdateListener(){

                    @Override
                    public void onUpdateAvaiable(String version)
                    {
                        updater.showConfirmDialog();
                    }

                    @Override
                    public void onError(String msg)
                    {
                        Toast.makeText(getApplicationContext(),"Error: "+msg,0).show();
                    }
                });
    }
}