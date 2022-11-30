package com.jfernandez.fito_alpha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    private ImageButton ibConfiguracio, ibCompte, ibCamera, ibSearch, ibOpcions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ibConfiguracio = findViewById(R.id.btnFeedback);
        ibCompte = findViewById(R.id.btnCompta);
        ibCamera = findViewById(R.id.btnCamera);
        ibSearch = findViewById(R.id.btnLupa);
        ibOpcions = findViewById(R.id.btnOpcions);

        ibConfiguracio.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                    Intent Feedback = new Intent(getBaseContext(), Feedback.class);
                    startActivity(Feedback);
            }
        });

        ibCompte.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent Compte = new Intent(getBaseContext(), Login.class);
                startActivity(Compte);
            }
        });

        ibCamera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent Camera = new Intent(getBaseContext(), Camera.class);
                startActivity(Camera);
            }
        });

        ibSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent Search = new Intent(getBaseContext(), Search.class);
                startActivity(Search);
            }
        });

        ibOpcions.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent Opcions = new Intent(getBaseContext(), Menu.class);
                startActivity(Opcions);
            }
        });

    }
}