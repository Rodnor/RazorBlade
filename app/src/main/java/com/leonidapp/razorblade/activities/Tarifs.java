package com.leonidapp.razorblade.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.leonidapp.razorblade.R;

public class Tarifs extends MotherActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.tarifs_layout, R.id.base_toolbar);

        // POUR TEST, A SUPPRIMER ENSUITE
        Button testButtonTarif = (Button) findViewById(R.id.testButtonTarif);
        testButtonTarif.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("DEBUG", "Coucou");
            }
        });
    }
}
