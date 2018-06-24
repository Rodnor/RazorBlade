package com.leonidapp.razorblade.activities;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.leonidapp.razorblade.R;

public class accueil extends MotherActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState, R.layout.activity_accueil, R.id.accueil_toolbar);

        Button scannerButton = (Button) findViewById(R.id.scanner_button);

        scannerButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent myIntent = new Intent(accueil.this, Scanner.class);
                accueil.this.startActivity(myIntent);
            }
        });

        Button nearestShop = (Button) findViewById(R.id.nearest_shop_button);

        nearestShop.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                //Lancer activité magasin le plus proche
            }
        });

    }
}
