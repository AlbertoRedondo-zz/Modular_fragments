package com.santander.integration.core;

import android.app.Activity;

public class Core implements ICoreA {

    private static Core core;

    private Core() { }

    public synchronized static Core getInstance() {

        if (core == null) {

            core = new Core();
        }
        return core;
    }

    String fragmentAText;


    public void setText(String text){
        fragmentAText = text;
    }

    public String getFragmentAText() {
        return fragmentAText;
    }

}
