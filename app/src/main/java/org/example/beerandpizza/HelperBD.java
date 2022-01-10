package org.example.beerandpizza;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class HelperBD extends SQLiteOpenHelper{
    //Declaración de constantes que contienen información de la BD a la que se realiza la conexión
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Market.db";


    public HelperBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EstructuraBD.SQL_CREATE_ENTRIES);
    }//Fin onCreate()


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(EstructuraBD.SQL_DELETE_ENTRIES);
        onCreate(db);
    }//Fin onUpgrade()


    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }//Fin onDowngrade()
}//Fin Class
