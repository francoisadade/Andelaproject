package com.rayndevelopement.andelaproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  TextView welcomtxt;
    private   Button aboutbtn, profilbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomtxt = findViewById(R.id.textView);
        aboutbtn = findViewById(R.id.alcbtn);
        profilbtn = findViewById(R.id.profilebtn);

        aboutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutbtn();


            }
        });

        profilbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profilbtn();
            }
        });    }


      public void aboutbtn(){
          Intent intent = new Intent(this, AboutActivity.class);
          startActivity(intent);


    }

      public void profilbtn(){
        Intent intent = new Intent(this,ProfilActivity.class);
        startActivity(intent);
      }
}
