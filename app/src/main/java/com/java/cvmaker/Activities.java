package com.java.cvmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Activities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
        getSupportActionBar().setTitle("Activities");
    }
}