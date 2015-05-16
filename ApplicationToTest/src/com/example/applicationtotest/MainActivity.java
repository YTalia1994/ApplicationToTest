package com.example.applicationtotest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2); 
        Button button3 = (Button) findViewById(R.id.button3);        
        final TextView textView = (TextView) findViewById(R.id.textView1);
        final EditText editText = (EditText) findViewById(R.id.editText1);
        
        button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textView.setText(editText.getText().toString());				
			}
		});
        
        button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Button 2 wurde geklickt!", Toast.LENGTH_LONG).show();			
			}
		});
        
        button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, OtherActivity.class);
				startActivity(intent);
			}
		});
    }
}
