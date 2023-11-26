package com.example.lab03_offlinedatabase;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "personalbiodata.db";
    private static final int DATABASE_VERSION = 1;

    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no integer primary key, name text null, dob text null, gender textnull, address text null);";
        Log.d("Data", "onCreate "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}


