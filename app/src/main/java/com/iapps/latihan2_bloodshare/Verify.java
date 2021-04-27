package com.iapps.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Verify extends AppCompatActivity {

//Tanggal : 27/04/2021
//NIM : 10118045
//Nama : Muhammad Ilham Apriyadi
//Kelas : IF-2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        Button btn = (Button) findViewById(R.id.btnsend);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Verify.this, UserHome.class));
            }
        });
    }
}