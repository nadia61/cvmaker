package com.java.cvmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Template1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template1);
        getSupportActionBar().setTitle("Template 1");
    }
}