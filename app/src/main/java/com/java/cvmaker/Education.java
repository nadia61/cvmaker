package com.java.cvmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Education extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        getSupportActionBar().setTitle("Educational Background");
    }
}