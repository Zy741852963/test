package com.example.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
    
    /**
     * 
     * ����coolweatheroperhelper�ಢ�̳и���sqliteopenhelper
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
	 * province������䣬���а���name��code�������
	 */
	
	public static final String CREAT_CITY="create table City("
			+"id integer primary key autoincrement,"
			+"city_name text,"
			+"city_code text,"
			+"province_id integer)";
	/**
	 * city������䣬���а���name��code��provin_id�������
	 */
	
	public static final String CREAT_COUNTY="create table County("
			+"id integer primary key autoincrement,"
			+"county_name text"
			+"county_code text"
			+"city_id integer)";
	/**
	 * county������䣬���а���name��code��city_id�������
	 */
	
	@Override
	public void onCreate(SQLiteDatabase db) {
	db.execSQL(CREAT_PROVINCE);//����province��
	db.execSQL(CREAT_CITY);//����city��
	db.execSQL(CREAT_COUNTY);//����county��
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	//�̳и���ķ���
		
	}

	public static void main(String[] args) {
		
	}

	

}
