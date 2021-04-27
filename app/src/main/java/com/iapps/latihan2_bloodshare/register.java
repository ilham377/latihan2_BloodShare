package com.iapps.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class register extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Spinner spinner = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.bloodtype, R.layout.spinner_list);
        adapter.setDropDownViewResource(R.layout.spinner_list);
        spinner.setAdapter(adapter);


        Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.reshus, R.layout.spinner_list);
        adapter.setDropDownViewResource(R.layout.spinner_list);
        spinner2.setAdapter(adapter2);

        Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);
        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this, R.array.job, R.layout.spinner_list);
        adapter.setDropDownViewResource(R.layout.spinner_list);
        spinner3.setAdapter(adapter3);


        Button btn = (Button) findViewById(R.id.btnregister);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, Almost_there.class));
            }
        });



    }

}