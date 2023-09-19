package com.example.appmobileaceshigh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmobileslimerancher.R;

public class MainActivity extends AppCompatActivity {

    Button btnsobre;
    Button btnhistoria;
    Button btnmapas;
    Button btnsair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView btnWeb = findViewById(R.id.Id_Web);

        btnWeb.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://github.com/H1kkii/Aces-High-Game.git "))));

        btnsobre = findViewById (R.id.btnsobre);
        btnsobre.setOnClickListener(v -> {
            Intent Sobre  = new Intent(getApplicationContext(), Sobre.class);
            startActivity(Sobre);

        });

        btnhistoria = findViewById(R.id.btnhistoria);
        btnhistoria.setOnClickListener(v -> {

            Intent historia  = new Intent(getApplicationContext(), Historia.class);
            startActivity(historia);
        });

        btnmapas = findViewById(R.id.btnmapas);
        btnmapas.setOnClickListener (v -> {
            Intent Mapas= new Intent(getApplicationContext(), Mapas.class);
            startActivity(Mapas);

        });

        btnsair = findViewById(R.id.btnsair);
        btnsair.setOnClickListener (v -> {
            finishAffinity();
            System.exit(0);
        });

    }
}
