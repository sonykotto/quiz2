package com.example.quiz2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pertama extends Activity{
	
	Button jumlah;
	EditText input1, input2;
	TextView hasil;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ppertama);
	
	jumlah =(Button)findViewById(R.id.jumlah1);
	input1 =(EditText)findViewById(R.id.input11);
	input2 =(EditText)findViewById(R.id.input12);
	hasil =(TextView)findViewById(R.id.hasil1);
	
	jumlah.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			int A = Integer.parseInt(input1.getText().toString());
			int B = Integer.parseInt(input2.getText().toString());
			if (A > B){
				hasil.setText("Anda Membandingkan dengan Input Pertama Lebih Besar Yaitu "+String.valueOf(A)+" Besar Dari Pada Input Kedua");
        }
			else{
                hasil.setText("Anda Membandingkan dengan Input Kedua Lebih Besar Yaitu "+String.valueOf(B)+" Besar Dari Pada Input Pertama");
            }
	
		}
	});
	}

}
