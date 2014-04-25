package symlab.ust.hk.database.manager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "event-data.db";
	
	private static final int DATABASE_VERSION = 1;

	
	public DatabaseHelper(Context context) {
	    super(context, DATABASE_NAME, null, DATABASE_VERSION);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		EventDescriptor.onCreate(db);
	
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		EventDescriptor.onUpgrade(db, oldVersion, newVersion);
	
	}

}


