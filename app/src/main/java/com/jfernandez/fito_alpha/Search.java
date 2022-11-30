package com.jfernandez.fito_alpha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Search extends AppCompatActivity {

    private SearchView svPlantNom;
    private Button btCerca;
    private ImageButton btEnrere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        svPlantNom = findViewById(R.id.svPlantNom);
        btEnrere = findViewById(R.id.btEnrereSearch);
        btCerca = findViewById(R.id.btnSearch);

        btEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Redirigim cap al menu principal si l'usuari si l'usuari fa click en el botó per tirar enredere.
                Intent MainMenu = new Intent(getBaseContext(), MainMenu.class);
                startActivity(MainMenu);
            }
        });

        btCerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Comprovem que l'usuari hagui introduït una planta. En cas negatiu, mostrem un Toast informant a l'usuari.
                // En cas afirmatiu, anem a l'activity on mostra el nom i les propietats de la planta.
                if (svPlantNom.equals("")) {
                    Toast.makeText(Search.this, "No s'ha introduït ninguna planta!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent PlantaBuscada = new Intent(getBaseContext(), FoundPlant.class);
                    startActivity(PlantaBuscada);
                }
            }
        });

    }
}