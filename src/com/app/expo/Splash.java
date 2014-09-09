package com.app.expo;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {
	
	Context context = Splash.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        

        Thread splash = new Thread() {
            
        	public void run() {
                 
                try {
                    sleep(5000);
                     
                    Intent Main_screen = new Intent(context,Main.class);
                    startActivity(Main_screen);  
                    finish();
                     
                } catch (Exception e) {
                  e.printStackTrace();
                }
            }
        };
         
        splash.start();
    
    
    }
}
