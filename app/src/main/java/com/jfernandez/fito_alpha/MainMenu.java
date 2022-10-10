package com.jfernandez.fito_alpha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

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

        /*configuracio.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                    Intent intent = new Intent(getBaseContext(), Configuracio.class);
                    startActivity(intent);
            }
        });*/

        compte.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Login.class);
                startActivity(intent);
            }
        });

       /* camera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Camera.class);
                startActivity(intent);
            }
        });

        lupa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), SearchActivity.class);
                startActivity(intent);
            }
        }); */

        opcions.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Menu.class);
                startActivity(intent);
            }
        });

    }
}