package com.iapps.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {

//Tanggal : 27/04/2021
//NIM : 10118045
//Nama : Muhammad Ilham Apriyadi
//Kelas : IF-2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView txtregister = (TextView) findViewById(R.id.txtregister);

        txtregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(login.this, register.class);
                startActivity(myIntent);
            }
        });
    }
}