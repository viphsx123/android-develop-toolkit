package com.allthelucky.touchmoint;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onBackPressed() {
		super.onBackPressed();
		System.exit(0);
	}

}