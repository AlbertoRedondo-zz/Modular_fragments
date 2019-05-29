package com.santander.integration.sme_architecture_test;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.santander.integration.core.Core;
import com.santander.integration.core.IActivity;
import com.santander.integration.core.IFragmentA;
import com.santander.integration.modulea.FragmentA1;

public class MainActivity extends AppCompatActivity implements IActivity {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onAttachFragment (Fragment childFragment) {
        Log.d("Phone Main", "Fragment attached: " + childFragment);
        if(childFragment instanceof FragmentA1){
            ((FragmentA1)childFragment).setCore(Core.getInstance());
        }
    }

    public void showText(String fragmentAText){
        Log.d(TAG, "texto: " + fragmentAText);
    }
}
