package com.leonidapp.razorblade.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.leonidapp.razorblade.managers.ProfilManager;

public class Database extends SQLiteOpenHelper {

        // nom de la base de données
        private static final String DATABASE_NAME = "la_barbe_de_papa.db";

        private static final int DATABASE_VERSION = 1;
        private static Database sInstance;

        public static synchronized Database getInstance(Context context) {
            if (sInstance == null) { sInstance = new Database(context); }
            return sInstance;
        }

        private Database(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        /**
         * Méthode permettant de créer les tables dans la base de données.
         * @param sqLiteDatabase instance de la base de données où les tables vont être créées.
         */
        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(ProfilManager.CREATE_TABLE_PROFIL);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
            onCreate(sqLiteDatabase);
        }
}
