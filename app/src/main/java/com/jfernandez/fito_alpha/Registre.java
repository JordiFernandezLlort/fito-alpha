package com.jfernandez.fito_alpha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registre extends AppCompatActivity {

    private TextView ptUsuari, ptContrasenya, ptRContrasenya, ptTelefon, ptEmail;
    private Button  btConfirmar;
    private ImageButton btEnrere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registre);
        Intent dadesRebudes = getIntent();

        ptUsuari = findViewById(R.id.ptUsuari);
        ptContrasenya = findViewById(R.id.ptContrasenya);
        ptRContrasenya = findViewById(R.id.ptRContrasenya);
        ptTelefon = findViewById(R.id.ptTelefon);
        ptEmail = findViewById(R.id.ptEmail);
        btEnrere = findViewById(R.id.btEnrere);
        btConfirmar = findViewById(R.id.btConfirmar);

        btEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Al donar click et dirigeix a la pagina de login
                Intent pagina1 = new Intent(getBaseContext(), Login.class);
                startActivity(pagina1);
            }
        });

        btConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Registre.this, "Encara no tenim la base de dades feta", Toast.LENGTH_SHORT).show();
            }
        });
    }
}