package com.example.karyawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivityDiki extends AppCompatActivity {
ImageView imgGaji, imgPetunjuk, imgTentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_diki);

        imgGaji = findViewById(R.id.imgKaryawan);
        imgPetunjuk = findViewById(R.id.imgPetunjuk);
        imgTentang = findViewById(R.id.imgTentang);

        imgGaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivityDiki.this, Gaji_Diki.class);
                startActivity(i);
            }
        });

        imgPetunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivityDiki.this, Petunjuk_Diki.class);
                startActivity(i);
            }
        });

        imgTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivityDiki.this,Tentang_Diki.class);
                startActivity(i);
            }
        });


    }
}