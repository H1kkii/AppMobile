package com.example.appmobileaceshigh;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmobileslimerancher.R;

public class Mapas extends AppCompatActivity {

    Button btnvoltar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas);

        btnvoltar2 = findViewById(R.id.btnvoltar2);
        btnvoltar2.setOnClickListener (v -> finish ());

    }
}