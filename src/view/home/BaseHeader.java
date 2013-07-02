package view.home;

import com.bukalapakmobile.R;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class BaseHeader extends Activity{
	Button home;
	
	public void setHeader(){
		 home = (Button)findViewById(R.id.home_icon);
		
	
	
	home.setOnClickListener(new View.OnClickListener() {
		public void onClick(View view) {
			startActivity(new Intent(BaseHeader.this,Dashboard.class));
			finish();
		}});

	}
}