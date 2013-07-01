package view.home;



import com.bukalapakmobile.R;

import services.APIService;


import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Dashboard extends Activity{
	

     
     private APIService api;
     
     private ServiceConnection  mConnection;
     
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);
        
       
        
        
        /**
         * Creating all buttons instances
         * */
        // Dashboard News feed button
        Button btn_newsfeed = (Button) findViewById(R.id.btn_news_feed);
        
        // Dashboard Friends button
        Button btn_friends = (Button) findViewById(R.id.btn_friends);
        
        // Dashboard Messages button
        Button btn_messages = (Button) findViewById(R.id.btn_messages);
        
        // Dashboard Places button
        Button btn_places = (Button) findViewById(R.id.btn_places);
        
        // Dashboard Events button
        Button btn_events = (Button) findViewById(R.id.btn_events);
        
        // Dashboard Photos button
        Button btn_photos = (Button) findViewById(R.id.btn_photos);
        
        // Dashboard Photos button
        Button btn_logout = (Button) findViewById(R.id.footer_logout);
        
        TextView UserFooter = (TextView) findViewById(R.id.footer_text);
        
        
        mConnection = new ServiceConnection() {
			@Override
			public void onServiceConnected(ComponentName arg0, IBinder arg1) {
				api = ((APIService.MyBinder) arg1).getService();
		        Toast.makeText(Dashboard.this, "Connected to API Service", Toast.LENGTH_SHORT).show();
		        
		
			}

			@Override
			public void onServiceDisconnected(ComponentName arg0) {
				Toast.makeText(Dashboard.this, "Disconnected from API Service", Toast.LENGTH_SHORT).show();
			}

			

	      };
        
	      Intent intent = new Intent(this, APIService.class);
	        
	      bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
	      //session.checkLogin();
	      // name
	      //String name = session.getUsername();
			String name = "halo";
	      
        
        /**
         * Handling all button click events
         * */
        
        UserFooter.setText("Hi " + name);
        
        // Listening to News Feed button click
        btn_logout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				//Intent i = new Intent(getApplicationContext(),
	            //        AddRestaurant.class);
	            //startActivity(i);
	        	Button button = (Button)view;
	        	button.setTextColor(Color.rgb(0, 10, 55));
	        	//button.setBackgroundColor(Color.rgb(255, 255, 255));
	        	Toast.makeText(Dashboard.this, "Log Out is selected", Toast.LENGTH_SHORT).show();
	        	// Clear the session data
                // This will clear all session data and 
                // redirect user to MainActivity
	        	api.removeRecentAccess();
                finish();
	            //PenggunaController.logoutUser(getApplicationContext());
	            //Intent login = new Intent(getApplicationContext(), MainActivity.class);
				//login.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				//startActivity(login);
				//finish();
			}
		});
        
        // Listening to News Feed button click
        btn_newsfeed.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Toast.makeText(Dashboard.this, "Me", Toast.LENGTH_SHORT).show();
	        	
			}
		});
        
       // Listening Friends button click
        btn_friends.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Toast.makeText(Dashboard.this, "Me2", Toast.LENGTH_SHORT).show();
	        	
			}
		});
        
        // Listening Messages button click
        btn_messages.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Toast.makeText(Dashboard.this, "Me3", Toast.LENGTH_SHORT).show();
	        	
			}
		});
        
        // Listening to Places button click
        btn_places.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Toast.makeText(Dashboard.this, "Me4", Toast.LENGTH_SHORT).show();
	        	
			}
		});
        
        // Listening to Events button click
        btn_events.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Toast.makeText(Dashboard.this, "Me5", Toast.LENGTH_SHORT).show();
	        	
			}
		});
        
        // Listening to Photos button click
        btn_photos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				Toast.makeText(Dashboard.this, "Me6", Toast.LENGTH_SHORT).show();
	        	
			}
		});
    }
}
