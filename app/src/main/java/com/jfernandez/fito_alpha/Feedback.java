package com.jfernandez.fito_alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    private Button btnEnviar;
    private ImageButton btnEnrrere;
    private EditText etNom, etEmail, etDubtes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        etNom = findViewById(R.id.etNom);
        etEmail = findViewById(R.id.etEmail);
        etDubtes = findViewById(R.id.etDubtes);
        btnEnrrere = findViewById(R.id.btnEnrrereSugg);
        btnEnviar = findViewById(R.id.btnEnviarSugg);


        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etNom.getText().toString().isEmpty() || etEmail.getText().toString().isEmpty() || etDubtes.getText().toString().isEmpty()) {
                    Toast.makeText(Feedback.this, "Omple les caselles si vols continuar", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Feedback.this, "El missatge s'ha enviat satisfactòriament", Toast.LENGTH_SHORT).show();
                    Intent menuPrincipal = new Intent(getBaseContext(), MainMenu.class);
                    startActivity(menuPrincipal);
                }
            }
        });

        btnEnrrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuPrincipal = new Intent(getBaseContext(), MainMenu.class);
                startActivity(menuPrincipal);
            }
        });

    }
}