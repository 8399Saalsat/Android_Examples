package com.example.getlocationsimple;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {

	public MyService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId){
		return Service.START_NOT_STICKY;
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
