package com.example.u.wieghtcheck;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by u on 3/2/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    // Explicit
    public static final String database_name = "Weight.db"; // ประกาศค่าคงที่ ที่ไม่สามารถแก้ไข้ได้
    private static final int database_version = 1;
    private static final String create_table_weight = "create table weightTABLE (" +
            "_id integer primary key," +
            "Date text," +
            "Weight text);";
    private static final String create_table_user = "create table userTable (" +
            "_id string primary key," +
            "fname text," +
            "lname text," +
            "email text);";


    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);
    }   // constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_table_weight);
        sqLiteDatabase.execSQL(create_table_user);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}       // Main Class
