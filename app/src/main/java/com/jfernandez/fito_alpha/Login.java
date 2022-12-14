package com.jfernandez.fito_alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {//AppCompatActivity {

    private Button btRegistre, btIsessio;
    private TextView usuari, contrasenya;
    private ImageButton btEnrere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btRegistre = findViewById(R.id.registre);
        btIsessio = findViewById(R.id.isessio);
        usuari = findViewById(R.id.nom);
        contrasenya = findViewById(R.id.contrasenya);
        btEnrere = findViewById(R.id.btEnrere);

        btRegistre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Al donar click et dirigeix a la pagina de registre
                Intent pagina2 = new Intent(getBaseContext(), Registre.class);
                startActivity(pagina2);
            }
        });

        btIsessio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usuari.getText().toString().isEmpty() || contrasenya.getText().toString().isEmpty()) {
                    Toast.makeText(Login.this, "Omple les caselles si vols continuar", Toast.LENGTH_SHORT).show();

                }else{
                    Intent pagina2 = new Intent(getBaseContext(), Registre.class);
                    startActivity(pagina2);

                }
            }
        });
        btEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Al donar click et dirigeix a la pagina de login
                Intent pagina1 = new Intent(getBaseContext(), MainMenu.class);
                startActivity(pagina1);
            }
        });


    }
}