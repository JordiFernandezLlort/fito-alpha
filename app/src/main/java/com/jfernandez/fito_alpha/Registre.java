package com.jfernandez.fito_alpha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registre extends AppCompatActivity {

    private EditText etUsuari, etContrasenya, etRContrasenya, etTelefon, etEmail;
    private Button  btnConfirmar;
    private ImageButton btnEnrere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registre);


        // Mapeig dels elements del layout
        etUsuari = findViewById(R.id.etUsuari);
        etContrasenya = findViewById(R.id.etContrasenya);
        etRContrasenya = findViewById(R.id.etRContrasenya);
        etTelefon = findViewById(R.id.etTelefon);
        etEmail = findViewById(R.id.etEmailR);
        btnEnrere = findViewById(R.id.btnEnrereR);
        btnConfirmar = findViewById(R.id.btnConfirmar);


        btnEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login = new Intent(getBaseContext(), Login.class);
                startActivity(Login);
            }
        });


        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUsuari.getText().toString().isEmpty() || etContrasenya.getText().toString().isEmpty() ||
                        etRContrasenya.getText().toString().isEmpty() || etEmail.getText().toString().isEmpty()) {
                    Toast.makeText(Registre.this, "Error! Hi han camps que estan vuits!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(Registre.this, "L'usuari s'ha creat satisfactòriament!", Toast.LENGTH_SHORT).show();
                    Intent MenuPrincipal = new Intent(getBaseContext(), MainMenu.class);
                    startActivity(MenuPrincipal);
                }
            }
        });

    }
}