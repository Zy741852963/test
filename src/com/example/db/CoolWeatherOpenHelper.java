package com.example.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
    
    /**
     * 
     * 创建coolweatheroperhelper类并继承父类sqliteopenhelper
     *
     */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}
	public static final String CREAT_PROVINCE="create table Province("
			+"id integer primary key autoincrement,"
			+"provices_name text"
			+"provices_code text)";
	/**
	 * province表建表语句，其中包含name和code两个语句
	 */
	
	public static final String CREAT_CITY="create table City("
			+"id integer primary key autoincrement,"
			+"city_name text,"
			+"city_code text,"
			+"province_id integer)";
	/**
	 * city表建表语句，其中包含name和code和provin_id三个语句
	 */
	
	public static final String CREAT_COUNTY="create table County("
			+"id integer primary key autoincrement,"
			+"county_name text"
			+"county_code text"
			+"city_id integer)";
	/**
	 * county表建表语句，其中包含name和code和city_id三个语句
	 */
	
	@Override
	public void onCreate(SQLiteDatabase db) {
	db.execSQL(CREAT_PROVINCE);//创建province表
	db.execSQL(CREAT_CITY);//创建city表
	db.execSQL(CREAT_COUNTY);//创建county表
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	//继承父类的方法
		
	}

	public static void main(String[] args) {
		
	}

	

}
