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

    private Button btnRegistre, btnIsessio;
    private TextView tvUsuari, tvContrasenya;
    private ImageButton btnEnrere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegistre = findViewById(R.id.registre);
        btnIsessio = findViewById(R.id.isessio);
        tvUsuari = findViewById(R.id.nom);
        tvContrasenya = findViewById(R.id.contrasenya);
        btnEnrere = findViewById(R.id.btEnrere);

        btnRegistre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Al donar click et dirigeix a la pagina de registre
                Intent pagina2 = new Intent(getBaseContext(), Registre.class);
                startActivity(pagina2);
            }
        });

        btnIsessio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvUsuari.getText().toString().isEmpty() || tvContrasenya.getText().toString().isEmpty()) {
                    Toast.makeText(Login.this, "Omple les caselles si vols continuar", Toast.LENGTH_SHORT).show();

                }else{
                    Intent MainMenu = new Intent(getBaseContext(), MainMenu.class);
                    Toast.makeText(Login.this, "S'ha iniciat sessió correctament!", Toast.LENGTH_SHORT).show();
                    startActivity(MainMenu);

                }
            }
        });


        btnEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainMenu = new Intent(getBaseContext(), MainMenu.class);
                startActivity(MainMenu);
            }
        });


    }
}