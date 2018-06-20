package com.leonidapp.razorblade.managers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.leonidapp.razorblade.database.Database;
import com.leonidapp.razorblade.pojos.Profil;

public class ProfilManager {
    private static final String TABLE_NAME_PROFIL = "profil";
    public static final String KEY_ID_PROFIL="id_profil";
    public static final String KEY_NOM="nom";
    public static final String KEY_PRENOM="prenom";


    // Si association avec d'autres tables
    private static final String TABLE_NAME_ = "";
    public static final String KEY_ID_="id_";

    private Database database;
    private SQLiteDatabase db;

    /**
     * Méthode exécutant la requête de création de la table Article.
     */
    public static final String CREATE_TABLE_PROFIL = "CREATE TABLE "+TABLE_NAME_PROFIL+
            " (" +
            " "+KEY_ID_PROFIL+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
            KEY_NOM+" TEXT NOT NULL, " +
            KEY_PRENOM+" INTEGER NOT NULL, ";// +
            //"FOREIGN KEY ("+KEY_MAGASIN_ARTICLE+") REFERENCES " + TABLE_NAME_MAGASIN+" ("+KEY_ID_MAGASIN+"));";

    /**
     * Constructeur de la classe ArticleManager.
     * @param context
     */
    public ProfilManager(Context context)
    {
        database = Database.getInstance(context);
    }

    /**
     * Ouverture de la base de données.
     */
    public void open()
    {
        db = database.getWritableDatabase();
    }

    /**
     * Fermeture de la base de données.
     */
    public void close()
    {
        db.close();
    }

    /**
     *
     * @param profil
     * @return
     */
    public long addProfil(Profil profil) {

        ContentValues values = new ContentValues();
        values.put(KEY_NOM, profil.getNom().trim());
        values.put(KEY_PRENOM, profil.getPrenom().trim());

        return db.insert(TABLE_NAME_PROFIL,null,values);
    }

    /**
     *
     * @param profil
     * @return
     */
    public int modArticle(Profil profil) {

        ContentValues values = new ContentValues();
        values.put(KEY_NOM, profil.getNom().trim());
        values.put(KEY_PRENOM, profil.getPrenom().trim());

        String where = KEY_ID_PROFIL+" = ?";
        String[] whereArgs = {profil.getId()+""};

        return db.update(TABLE_NAME_PROFIL, values, where, whereArgs);
    }

    /**
     *
     * @param id
     * @return
     */
    public Profil getProfil(int id) {

        Profil p=new Profil("","");

        Cursor c = db.rawQuery("SELECT * FROM "+TABLE_NAME_PROFIL+" WHERE "+KEY_ID_PROFIL+"="+id, null);
        if (c.moveToFirst()) {
            p.setNom(c.getString(c.getColumnIndex(KEY_NOM)));
            p.setPrenom(c.getString(c.getColumnIndex(KEY_PRENOM)));
            c.close();
        }

        return p;
    }
}
