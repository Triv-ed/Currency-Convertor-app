package com.example.cc1;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {
    private  static final String dbname="signup.db";
    public database(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String q="create table users (id integer primary key autoincrement,name text, mobilenum biginteger)";
        sqLiteDatabase.execSQL(q);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase ,int i,int i1) {
        sqLiteDatabase.execSQL("drop table if exists users");
        onCreate(sqLiteDatabase);

    }
    public boolean  insert_data(String name,String mobilenum)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put("name",name);
        c.put("mobilenum",mobilenum);
        long r=db.insert("users",null,c);
        if(r==-1) return false;
        else
            return true;
    }



}



