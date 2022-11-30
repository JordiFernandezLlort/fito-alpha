package com.jfernandez.fito_alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class FoundPlant extends AppCompatActivity {


    private ImageButton btnEnrere;
    private ImageButton btnPreferit;
    private Button btnNC, btnNP, btnPN, btnPM, btnR, btnC, btnPA, btnComb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found_plant);

        btnEnrere = findViewById(R.id.btnEnrereFP);
        btnPreferit = findViewById(R.id.btnPreferit);
        btnNC = findViewById(R.id.btnNC);
        btnNP = findViewById(R.id.btnNP);
        btnPN = findViewById(R.id.btnPN);
        btnPM = findViewById(R.id.btnPM);
        btnR = findViewById(R.id.btnR);
        btnC = findViewById(R.id.btnC);
        btnPA = findViewById(R.id.btnPA);
        btnComb = findViewById(R.id.btnComb);

        btnEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuPrincipal = new Intent(getBaseContext(), MainMenu.class);
                startActivity(menuPrincipal);
            }
        });

        btnPreferit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoundPlant.this, "Planta guardada correctament a preferides!", Toast.LENGTH_SHORT).show();
            }
        });

        btnNC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoundPlant.this, "Hauria de mostrar el nom cientific en un TextView.", Toast.LENGTH_SHORT).show();
            }
        });

        btnNP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoundPlant.this, "Hauria de mostrar els noms populars en un TextView. ", Toast.LENGTH_SHORT).show();
            }
        });

        btnPN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoundPlant.this, "Hauria de mostrar les propietats nutricionals en un TextView.", Toast.LENGTH_SHORT).show();
            }
        });

        btnPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoundPlant.this, "Hauria de mostrar les propietats medicinals en un TextView.", Toast.LENGTH_SHORT).show();
            }
        });

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoundPlant.this, "Hauria de mostrar les receptes en un TextView.", Toast.LENGTH_SHORT).show();
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoundPlant.this, "Hauria de mostrar com es pot cultivar la planta en un TextView.", Toast.LENGTH_SHORT).show();
            }
        });

        btnPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoundPlant.this, "Hauria de mostrar les parts aprofitables de la planta en un TextView.", Toast.LENGTH_SHORT).show();
            }
        });

        btnComb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FoundPlant.this, "Hauria de mostres les possibles combinacions de la planta en un TextView.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}