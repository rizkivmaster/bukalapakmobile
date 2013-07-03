package view.product.list;



import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import com.bukalapakmobile.R;
public class MyLapakListView extends Activity {
	// All static variables
	static final String KEY_NAME = "song"; // parent node
	static final String KEY_STATUS = "id";
	static final String KEY_STOCK = "title";
	static final String KEY_PRICE = "artist";
	
	ListView listLapak;
    MyLapakAdapter adapter;
    
    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_product_list_main);
		

		ArrayList<HashMap<String, String>> productList = new ArrayList<HashMap<String, String>>();

		// looping through all product list
		/*
		for (int i = 0; i < nl.getLength(); i++) {
			// creating new HashMap
			HashMap<String, String> map = new HashMap<String, String>();
			Element e = (Element) nl.item(i);
			// adding each child node to HashMap key => value
			map.put(KEY_NAME, parser.getValue(e, KEY_ID));
			map.put(KEY_STATUS, parser.getValue(e, KEY_TITLE));
			map.put(KEY_STOCK, parser.getValue(e, KEY_ARTIST));
			map.put(KEY_PRICE, parser.getValue(e, KEY_DURATION));

			// adding HashList to ArrayList
			productList.add(map);
		}*/
		

		listLapak=(ListView)findViewById(R.id.list_mylapak);
		
		// Getting adapter by passing xml data ArrayList
        adapter=new MyLapakAdapter(this, productList);        
        listLapak.setAdapter(adapter);
        

        // Click event for single list row
        listLapak.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
							

			}
		});		
	}
}
