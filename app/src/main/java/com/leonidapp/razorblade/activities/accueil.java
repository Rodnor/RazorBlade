package com.leonidapp.razorblade.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ExpandableListView;

import com.leonidapp.razorblade.models.ExpandedMenuModel;
import com.leonidapp.razorblade.R;
import com.leonidapp.razorblade.adapters.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class accueil extends MotherActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState, R.layout.activity_accueil, R.id.accueil_toolbar);

        Button scannerButton = (Button) findViewById(R.id.scanner_button);

        scannerButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                //Lancer activité scanner
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
