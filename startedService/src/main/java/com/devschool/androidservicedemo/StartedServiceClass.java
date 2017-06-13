package com.devschool.androidservicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class StartedServiceClass extends Service {
    private static final String TAG = "StartedServiceClass";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: is Called");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: is Called");
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind: is Called");
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: is Called");
    }
}
