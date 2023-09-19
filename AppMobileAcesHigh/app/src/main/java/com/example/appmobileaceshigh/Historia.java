package com.example.appmobileaceshigh;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmobileslimerancher.R;

public class Historia extends AppCompatActivity {
    Button btnvoltar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        btnvoltar3 = findViewById(R.id.btnvoltar3);
        btnvoltar3.setOnClickListener (v -> finish ());

    }
}