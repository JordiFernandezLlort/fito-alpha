package com.jfernandez.fito_alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registre extends AppCompatActivity {

    private Button btEnrere, btConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registre);

        btEnrere = findViewById(R.id.enrere);

        Intent dadesRebudes = getIntent();

        btEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Al donar click et dirigeix a la pagina de registre
                Intent pagina1 = new Intent(getBaseContext(), Login.class);
                startActivity(pagina1);
            }
        });
    }
}