package com.example.u.wieghtcheck;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by u on 3/2/2559.
 */
public class MyManage {

    // Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public MyManage(Context Context) {

        // Create & Connected
        objMyOpenHelper = new MyOpenHelper(Context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();

    }   // Constructor

}   // Main Class
