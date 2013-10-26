package com.example.getlocationsimple;

import android.app.IntentService;
import android.content.Intent;
import android.content.ContentValues;
import android.support.v4.content.LocalBroadcastManager;


public class GPSDriveService extends IntentService {
	public static final String LOG_TAG = "GPSDriveService";
	
	public GPSDriveService(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onHandleIntent(Intent workIntent) {
		// TODO Auto-generated method stub
		String dataString = workIntent.getDataString();
		
		Intent localIntent = new Intent(dataString);
		
		LocalBroadcastManager.getInstance(this).sendBroadcast(localIntent);
		
	}

}
