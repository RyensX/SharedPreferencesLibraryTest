package com.su.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.su.quicksharedpreferences.SharedPreferencesHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferencesHelper s = new SharedPreferencesHelper(this, "sdsdsds");
    }
}