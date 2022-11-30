package com.jfernandez.fito_alpha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;
import java.util.List;

public class SavePlants extends AppCompatActivity {

    // Firebase Var
    private DatabaseReference mDatabse;

    // Android Layout
    private TextView etText;
    private ListView listView;
    private ImageButton btnEnrere;

    // Array List
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_plants);

        btnEnrere = findViewById(R.id.btEnrerePG);
        mDatabse = FirebaseDatabase.getInstance().getReference();

        List<String> arrayList = Arrays.asList("Rosa", "Margarita", "Clavell", "Àrnica", "Olivera", "Genciana", "Sàlvia", "Malva", "Ortiga", "Camamilla", "Ruda", "Espígol");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);


        // Mapajem els elements del layout
        etText = (TextView) findViewById(R.id.tvPlantaGuardada);
        listView = (ListView) findViewById(R.id.lvPlants);


        listView.setAdapter(adapter);

        btnEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MenuPrincipal = new Intent(getBaseContext(), MainMenu.class);
                startActivity(MenuPrincipal);
            }
        });

    }
}