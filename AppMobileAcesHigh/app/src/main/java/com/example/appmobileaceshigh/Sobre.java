package com.example.appmobileaceshigh;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmobileslimerancher.R;

public class Sobre extends AppCompatActivity {

    Button btnvoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        btnvoltar = findViewById(R.id.btnvoltar);
        btnvoltar.setOnClickListener (v -> finish ());

    }
}