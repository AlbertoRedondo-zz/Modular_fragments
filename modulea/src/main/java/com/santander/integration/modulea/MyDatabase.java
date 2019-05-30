package com.santander.integration.modulea;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class MyDatabase {

    @Inject
    MyDatabase(@Named("ApplicationContext") Context context) {
        Log.d("MyDatabase", context.getString(R.string.app_name));
        // more code
    }
}
