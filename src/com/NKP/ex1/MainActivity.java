package com.NKP.ex1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/*
 * Developed By: Nandan K Pandya
 * Date: December 5th 2014
 * tutorial for nandanpandya.com   
 * */

public class MainActivity extends Activity {
	Button submit; // created object of Button
	EditText user; // created ojcet of EditText

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		submit = (Button) findViewById(R.id.submit); // get the reference of
														// button from the
														// layout file
		user = (EditText) findViewById(R.id.name);// get the reference of
														// EditText from the
														// layout file

		submit.setOnClickListener(new OnClickListener() {
			// setting on click listener to change activity
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Screen2.class);/*
																			 * created
																			 * intend
																			 * to
																			 * pass
																			 * the
																			 * text
																			 * information
																			 * and
																			 * to
																			 * change
																			 * the
																			 * screen
																			 */
				i.putExtra("name", user.getText().toString());// setting the value to send
				startActivity(i);// starting screen2 activity
			}
		});
	}
}
