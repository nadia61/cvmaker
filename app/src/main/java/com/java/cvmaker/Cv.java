package com.java.cvmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cv extends AppCompatActivity {
    Button msbtn,pdbtn,edbtn,exbtn,skbtn,obtn,rfbtn,ptbtn,lnbtn,ibtn,abtn,asbtn,psbtns,cgbl,vcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);
        getSupportActionBar().setTitle("Profile");
        msbtn = findViewById(R.id.msbtn);
        pdbtn = findViewById(R.id.pdbtn);
        edbtn = findViewById(R.id.edbtn);
        exbtn = findViewById(R.id.exbtn);
        skbtn = findViewById(R.id.skbtn);
        obtn = findViewById(R.id.obtn);
        rfbtn = findViewById(R.id.rfbtn);
        ptbtn = findViewById(R.id.ptbtn);
        lnbtn = findViewById(R.id.lnbtn);
        ibtn = findViewById(R.id.ibtn);
        abtn = findViewById(R.id.abtn);
        asbtn = findViewById(R.id.asbtn);
        psbtns = findViewById(R.id.psbtns);
        cgbl = findViewById(R.id.cgbl);
        vcv = findViewById(R.id.vcv);
        msbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Manage.class);
                startActivity(i);
            }
        });
        pdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Personal.class);
                startActivity(i);
            }
        });
        edbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Education.class);
                startActivity(i);
            }
        });
        exbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Experience.class);
                startActivity(i);
            }
        });
        skbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,skill.class);
                startActivity(i);
            }
        });
        obtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Objective.class);
                startActivity(i);
            }
        });
        rfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Reference.class);
                startActivity(i);
            }
        });
        ptbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Project.class);
                startActivity(i);
            }
        });
        lnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Language.class);
                startActivity(i);
            }
        });
        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Interest.class);
                startActivity(i);
            }
        });
        abtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Acheivement.class);
                startActivity(i);
            }
        });
        asbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Activities.class);
                startActivity(i);
            }
        });
        psbtns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Publication.class);
                startActivity(i);
            }
        });
        cgbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,Signature.class);
                startActivity(i);
            }
        });
        vcv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cv.this,ChooseTemplate.class);
                startActivity(i);
            }
        });
    }
}