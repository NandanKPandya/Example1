package com.NKP.ex1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Screen2 extends Activity {
	TextView show;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen2);
		Intent i= getIntent();// getting the user information from the MainActivity .
		show =(TextView) findViewById(R.id.usertext); // // get the reference of TextView from the layout file
		show.setText(i.getStringExtra("name")); // set the name from intent 
	}
}
