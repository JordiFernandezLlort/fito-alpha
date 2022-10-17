package com.jfernandez.fito_alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    private Button btCamera, btCerca, btGuardades, btXarxes, btReceptes;
    private ImageButton btEnrere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent dadesRebudes = getIntent();

        btEnrere = findViewById(R.id.btEnrere);
        btCamera = findViewById(R.id.btCamera);
        btCerca = findViewById(R.id.btCerca);
        btGuardades = findViewById(R.id.btGuardar);
        btXarxes = findViewById(R.id.btXarxes);
        btReceptes = findViewById(R.id.btReceptes);

        btEnrere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paginaMainMenu = new Intent(getBaseContext(), MainMenu.class);
                startActivity(paginaMainMenu);
            }
        });

        btGuardades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent paginaGuardades = new Intent(getBaseContext(), Guardades.class);
                startActivity(paginaGuardades);*/
                Toast.makeText(Menu.this, "S'hanirà a la página guardades", Toast.LENGTH_SHORT).show();
            }
        });
        btXarxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent paginaXarxes = new Intent(getBaseContext(), Xarxes.class);
                startActivity(paginaXarxes);*/
                Toast.makeText(Menu.this, "S'hanirà a la página xarxes", Toast.LENGTH_SHORT).show();
            }
        });
        btReceptes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent paginaReceptes = new Intent(getBaseContext(), Receptes.class);
                startActivity(paginaReceptes);*/
                Toast.makeText(Menu.this, "S'hanirà a la página Receptes", Toast.LENGTH_SHORT).show();
            }
        });
        btCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent paginaCamera = new Intent(getBaseContext(), Camera.class);
                startActivity(paginaCamera);*/
                Toast.makeText(Menu.this, "S'hanirà a la página Càmera", Toast.LENGTH_SHORT).show();
            }
        });
        btCerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent paginaCerca = new Intent(getBaseContext(), Cerca.class);
                startActivity(paginaCerca);*/
                Toast.makeText(Menu.this, "S'hanirà a la página Cerca", Toast.LENGTH_SHORT).show();
            }
        });

}
}