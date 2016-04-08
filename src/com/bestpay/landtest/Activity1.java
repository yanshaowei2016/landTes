package com.bestpay.landtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Activity1 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		System.out.println("Activity1 onCreate()");
		setContentView(R.layout.activity1);
		((TextView) findViewById(R.id.tv1))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent activity2 = new Intent(Activity1.this,
								Activity2.class);
						startActivityForResult(activity2, 12);
					}
				});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		switch (requestCode) {
		case 12:
			if (resultCode == 13) {
				Intent activity5 = new Intent(Activity1.this, Activity5.class);
				startActivity(activity5);
				finish();
			}
			break;

		default:
			break;
		}
	}
}
