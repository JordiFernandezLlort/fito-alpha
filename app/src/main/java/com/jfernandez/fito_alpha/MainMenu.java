package com.jfernandez.fito_alpha;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;


public class MainMenu extends AppCompatActivity {

    private static final int RC_SIGN_IN = 123;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
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

        mFirebaseAuth = FirebaseAuth.getInstance();



        /*configuracio.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                    Intent intent = new Intent(getBaseContext(), Configuracio.class);
                    startActivity(intent);
            }
        });*/

        compte.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mAuthStateListener = new FirebaseAuth.AuthStateListener() {
                   @Override
                    public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                        FirebaseUser user = mFirebaseAuth.getCurrentUser();
                        if (user != null){
                            Toast.makeText(MainMenu.this, "hi ha usuari (click)", Toast.LENGTH_LONG).show();
                            //fer daialog
                            // si esta regsitrat
                            // AuthUI.getInstance().signOut(this); fara un logout
                        }else {
                            Toast.makeText(MainMenu.this, "no hi ha usuari (click)", Toast.LENGTH_LONG).show();
                            //9. resetegem la informació que contenen els camps informatius del layout. en cas que canviem d'usuari hem de protegir la informac
                            //11. inici amb google

                            AuthUI.IdpConfig googleIdp = new AuthUI.IdpConfig.GoogleBuilder().build();
                            AuthUI.IdpConfig microsoft = new AuthUI.IdpConfig.MicrosoftBuilder().build();
                            AuthUI.IdpConfig github = new AuthUI.IdpConfig.GitHubBuilder().build();
                            //1.si no hi ha usuari accedir a firebase i autentificar o donar d'alta
                            startActivityForResult(AuthUI.getInstance().
                                    createSignInIntentBuilder()
                                    .setIsSmartLockEnabled(false)
                                    .setTosUrl("https://joviat.com")
                                    .setAvailableProviders(Arrays.asList(new AuthUI.IdpConfig.EmailBuilder().build(),googleIdp))
                                    .build(), RC_SIGN_IN);

                        }
                    }

                };

                mFirebaseAuth.addAuthStateListener(mAuthStateListener);
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



    //2. 14/10/2022
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @NonNull Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RC_SIGN_IN){
            if(resultCode == RESULT_OK){
                Toast.makeText(this, "Benvingut, Benvinguda...", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Ho sento, ha fallat l'autenticació.", Toast.LENGTH_SHORT).show();
            }
        }
    } //3. 14/10/2022 compilar i donar d'alta un usuari (s'haurà de donar d'alta el servei a firebase console)



    @Override
    protected void onResume() {
        super.onResume();
        //per activar el servei d'autenticació
        //mFirebaseAuth.addAuthStateListener(mAuthStateListener);

    }

    @Override
    protected void onPause() {
        super.onPause();
        //deasctivar el servei d'autenticació per no gastar bateria
        if(mAuthStateListener!=null){
            mFirebaseAuth.removeAuthStateListener(mAuthStateListener);
        }
    }

    //7. creem un menú per poder fer logout
    /*
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_logout,menu); //en aquest punt creem un nou xml resource file de tipus menu
        return super.onCreateOptionsMenu(menu);
    }*/

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_logout,menu); //en aquest punt creem un nou xml resource file de tipus menu
        return super.onCreateOptionsMenu(menu);
    }

    //8. acció a fer pel menu seleccionat
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_sign_out:
                AuthUI.getInstance().signOut(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}