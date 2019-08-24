package com.example.loging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {
    TextView txt_saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        txt_saludo = findViewById(R.id.txt_saludo);
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        txt_saludo.setText(nombre);
    }
}
