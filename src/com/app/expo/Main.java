package com.app.expo;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity implements OnClickListener{

	private Context context = Main.this;
	private Button btn_evento;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		btn_evento = (Button) findViewById(R.id.btn_eventos);
		btn_evento.setOnClickListener(this);
		
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_eventos:
			goToEvento();
			break;

		}
	}
	
	
	
	
	
	
	/** 
	 * --------- Menu ------------ 
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		 switch (item.getItemId()) {
	     	/*case android.R.id.home:
	     		Intent  = new Intent(this,Main.class);
	     		startActivity(main);
	     		finish();
	     		return true;
	     	*/	
	     	case R.id.about:
	     	Toast.makeText(Main.this, "Sobre...", Toast.LENGTH_LONG).show();
	     	return true;	
	     		
	     	default:return super.onOptionsItemSelected(item);
	     } 
	}
	
	

	
	/**
	 * Metodos para trocar de tela...
	 * */
	private void goToEvento(){
		Intent i = new Intent(context,Evento.class);
		startActivity(i);
		finish();
	}
	
	
	

	 //Method to capture the Click of back button
 @Override
 public void onBackPressed() {
     AlertDialog.Builder back = new AlertDialog.Builder(Main.this);
     back.setMessage("Fechar aplicação?");
     back.setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
         public void onClick(DialogInterface arg0, int arg1) {
             finish();
         }
     });
     back.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
         public void onClick(DialogInterface arg0, int arg1) {
         }
     });
     back.create().show();
 }

	
}
