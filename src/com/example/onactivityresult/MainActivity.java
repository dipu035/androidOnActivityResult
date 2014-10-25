package com.example.onactivityresult;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * 
 * @author DIPU
 * @email dipu035_mbstu@yahoo.com
 *
 */
public class MainActivity extends Activity implements OnClickListener {

	
	Button btnGo;
	
	public static final String MESSAGE_REF = "message";
	private static final int SECOD_ACTIVITY = 101;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		btnGo = (Button) findViewById(R.id.btnGo);
		
		btnGo.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		
		Intent intent = new Intent(MainActivity.this, SecondActivity.class);
		startActivityForResult(intent, SECOD_ACTIVITY);
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
		if (resultCode == RESULT_OK) {
			if (requestCode == SECOD_ACTIVITY){
				String message = data.getStringExtra(MainActivity.MESSAGE_REF);
				Toast.makeText(this, message, Toast.LENGTH_LONG).show();
			}
		}
	}

}
