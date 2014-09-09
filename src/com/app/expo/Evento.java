package com.app.expo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Evento extends Activity{

	private Context context = Evento.this;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.evento);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.evento, menu);
		return true;
	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
     	case android.R.id.home:
     		goToHome();
     	return true;
     		
     	default:return super.onOptionsItemSelected(item);
     } 
	
	}
	
	
	
	
	private void goToHome(){
		Intent i = new Intent(context,Main.class);
		startActivity(i);
		finish();
	}
	
	
	//Method to capture the Click of back button
	@Override
	public void onBackPressed() {
		goToHome();
	}
	
	
}