package com.example.quiz2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView lvisi;
	String[] menu = {"Profil", "Quiz", "Keluar"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lvisi = (ListView)findViewById(R.id.lvlist);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);
		lvisi.setAdapter(adapter);
		lvisi.setOnItemClickListener(listclick);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private AdapterView.OnItemClickListener listclick = new AdapterView.OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, 
				long arg3) {
			// TODO Auto-generated method stub
			if (arg2==0){
			Intent intent = new Intent(MainActivity.this, Mainprofil.class);
			startActivity(intent);}
			else if (arg2==1){
			Intent intent1 = new Intent(MainActivity.this, isiquiz.class);
			startActivity(intent1);}
			else{
				System.exit(0);
			}
		}
			
	};
	
	
}
