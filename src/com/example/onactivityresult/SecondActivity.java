package com.example.onactivityresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity implements OnClickListener {
	
	Button btnSubmit;
	EditText etMessage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		init();
	}

	private void init() {
		btnSubmit = (Button) findViewById(R.id.btnSubmit);
		etMessage = (EditText) findViewById(R.id.et);
		
		btnSubmit.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		
		Intent intent = new Intent();
		intent.putExtra(MainActivity.MESSAGE_REF, etMessage.getText().toString());
		setResult(RESULT_OK, intent);
		finish();
		
	}
}
