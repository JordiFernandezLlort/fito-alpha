package com.jfernandez.fito_alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainMenu extends AppCompatActivity {

    private ImageButton configuracio, compte, camera, lupa, opcions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        configuracio = findViewById(R.id.botoConfig);
        compte = findViewById(R.id.botoCompte);
        camera = findViewById(R.id.botoCamera);
        lupa = findViewById(R.id.botoLupa);
        opcions = findViewById(R.id.botoOpcions);



    }
}