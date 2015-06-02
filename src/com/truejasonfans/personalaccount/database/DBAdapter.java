package com.truejasonfans.personalaccount.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DBAdapter {
	
	
	
	
	public static final String DATABASE_CREATE = null;
	public static final String DATABASE_NAME = null;
	public static final int DATABASE_VERSION = 0;
	public static final String TAG = "DBAdapter";

	private static class DatabaseHelper extends SQLiteOpenHelper {
		DatabaseHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL(DATABASE_CREATE);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
					+ newVersion + ", which will destroy all old data");
			db.execSQL("DROP TABLE IF EXISTS titles");
			onCreate(db);
		}
		
		public long insert() {
			return 0;

		}
		
		public void delete() {

		}

		public void update() {

		}

		public int select() {
			  SQLiteDatabase db = getReadableDatabase();
			  //return db.query(distinct, table, columns, selection, selectionArgs, groupBy, having, orderBy, limit, cancellationSignal)
			  return 1;
		}
	}

	private DatabaseHelper DBHelper;
	private SQLiteDatabase db;

	public DBAdapter open() throws SQLException {
		db = DBHelper.getWritableDatabase();
		return this;
	}

	// ---关闭数据库---

	public void close() {
		DBHelper.close();
	}
	// ---向数据库插入一个标题---

	
}
