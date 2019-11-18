package com.example.quiz2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class isiquiz extends Activity{
	
	Button pilihan1, pilihan2;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        pilihan1=(Button)findViewById(R.id.pilihan);
        pilihan2=(Button)findViewById(R.id.pilihan1);
        
        pilihan1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent intent = new Intent(isiquiz.this, pertama.class);
			startActivity(intent);
			}
		});
        
        pilihan2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent intent1 = new Intent(isiquiz.this, kedua.class);
			startActivity(intent1);
			}
		});
        
	}
}
