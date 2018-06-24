package com.leonidapp.razorblade.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.leonidapp.razorblade.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_profil);

        Button evaluateBtn = (Button) findViewById(R.id.btnNotez);

        evaluateBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                final AlertDialog alertDialog = new AlertDialog.Builder(Profil.this).create();
                View ratingView = getLayoutInflater().inflate(R.layout.dialog_rating, null);


                alertDialog.setTitle("Visite du "+getCurrentDate());
                alertDialog.setView(ratingView);

                alertDialog.setButton( DialogInterface.BUTTON_POSITIVE,"Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        alertDialog.cancel();
                    }});

                alertDialog.setButton( DialogInterface.BUTTON_NEGATIVE,"Annuler", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        alertDialog.cancel();
                    }});

                alertDialog.show();
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent myIntent = new Intent(Profil.this, accueil.class);
        Profil.this.startActivity(myIntent);
    }

    private String getCurrentDate(){
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        return df.format(c);
    }
}
