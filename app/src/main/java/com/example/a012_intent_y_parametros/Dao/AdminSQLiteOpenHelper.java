package com.example.a012_intent_y_parametros.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**SQLiteOpenHelper Esta clase nos permite crear la base de datos y actualizar la estructura de tablas y datos iniciales.*/
public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    public AdminSQLiteOpenHelper(Context context,String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
/**la clase padre SQLiteOpenHelper implementa constructores*/
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Articulos(Codigo INTEGER PRIMARY KEY,Descripcion TEXT,Precio Real)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
