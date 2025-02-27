package com.example.qrder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;

public class main_restorant_activity extends AppCompatActivity {

   private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main_restorant_activity);

        firebaseAuth=FirebaseAuth.getInstance ();
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu) {

        MenuInflater menuInflater = getMenuInflater ();
        menuInflater.inflate (R.menu.restorant_menu,menu);


        return super.onCreateOptionsMenu (menu);
    }

    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item) {

        if (item.getItemId ()==R.id.edit_profil){

            Intent ıntent = new Intent (getApplicationContext (),edit_profil_activity.class);
            startActivity (ıntent);

        }

        if (item.getItemId ()==R.id.restoran_menu_ekle){

            Intent ıntent =new Intent (getApplicationContext (),Menu_Yukle_activity.class);
            startActivity (ıntent);



        }

        if (item.getItemId ()==R.id.cıkıs_yap){

            firebaseAuth.signOut ();
            Intent ıntent = new Intent (getApplicationContext (),MainActivity.class);
            startActivity (ıntent);
            finish ();



        }


        return super.onOptionsItemSelected (item);
    }
}
