package com.jfernandez.fito_alpha;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
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
    public static SharedPreferences prefs;

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

        //obtenor l'objecte SheredPreferences
        prefs = getSharedPreferences("FitxerPreferences", MODE_PRIVATE);

        //posem valors guardats i si no hi ha dades deixem els camps en blanc(valors per defecte)
        ptUsuari.setText(prefs.getString("Usuari", ""));
        ptTelefon.setText(prefs.getString("Telefon", ""));
        ptEmail.setText(prefs.getString("Email", ""));
        ptContrasenya.setText(prefs.getString("Contrasenya", ""));




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
                guardaDades();

                Toast.makeText(Registre.this, "Registre CORRECTE: el teu usuaris és: " + ptUsuari.getText().toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getBaseContext(), MainMenu.class);
                startActivity(intent);
            }
        });
    }
    public void guardaDades(){

        SharedPreferences.Editor editor;
        editor = prefs.edit();

        editor.putString("Usuari", ptUsuari.getText().toString());
        editor.putString("CognContrasenyaom", ptContrasenya.getText().toString());
        editor.putString("Telefon", ptTelefon.getText().toString());
        editor.putString("Email", ptEmail.getText().toString());

    }
}