package com.bestpay.landtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Activity3 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		System.out.println("Activity3 onCreate()");
		setContentView(R.layout.activity3);
		((TextView) findViewById(R.id.tv1))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent activity4 = new Intent(Activity3.this,
								Activity4.class);
						startActivityForResult(activity4, 12);
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
				setResult(13);
				finish();
			}
			break;

		default:
			break;
		}
	}
}
