package com.java.cvmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Home extends AppCompatActivity {
    ViewFlipper flipper;
    Button crbtn,dd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        int[] imgarray = {R.drawable.s1,R.drawable.s2,R.drawable.s3};
        flipper = findViewById(R.id.flipper);
        crbtn = findViewById(R.id.crbtn);
        dd = findViewById(R.id.dd);
        crbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,Cv.class);
                startActivity(i);
            }
        });
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,Download.class);
                startActivity(i);
            }
        });

        for(int i = 0;i<imgarray.length;i++){
            showimage(imgarray[i]);
        }


    }
    public void showimage(int img){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(5000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }
}