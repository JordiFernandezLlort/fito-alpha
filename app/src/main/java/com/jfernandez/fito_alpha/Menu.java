package com.jfernandez.fito_alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    private Button btnCamera, btnCerca, btnGuardades, btnMapa;
    private ImageButton btnEnrere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnEnrere = findViewById(R.id.btnEnrereMenu);
        btnCamera = findViewById(R.id.btnCameraMenu);
        btnCerca = findViewById(R.id.btnCercaMenu);
        btnGuardades = findViewById(R.id.btnGuardarMenu);
        btnMapa = findViewById(R.id.btnMapaMenu);

        btnEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainMenu = new Intent(getBaseContext(), MainMenu.class);
                startActivity(MainMenu);
            }
        });

        btnGuardades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Guardades = new Intent(getBaseContext(), SavePlants.class);
                startActivity(Guardades);
            }
        });
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Camera = new Intent(getBaseContext(), Camera.class);
                startActivity(Camera);
            }
        });
        btnCerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Search = new Intent(getBaseContext(), Search.class);
                startActivity(Search);
            }
        });

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Mapa = new Intent(getBaseContext(), Map.class);
                startActivity(Mapa);
            }
        });


}
}