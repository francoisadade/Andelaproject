package com.rayndevelopement.andelaproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

public class ProfilActivity extends AppCompatActivity {

    private EditText tracktxt, countrytxt, emailtxt, phonetxt, usertxt;
    private ImageView andelapic;





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        tracktxt   = findViewById(R.id.track_edt);
        countrytxt = findViewById(R.id.country_edt);
        emailtxt   = findViewById(R.id.email_edt);
        phonetxt   = findViewById(R.id.number_edt);
        usertxt    = findViewById(R.id.username_edt);



    }
}
