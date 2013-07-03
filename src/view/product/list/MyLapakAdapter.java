package view.product.list;

import java.util.ArrayList;
import java.util.HashMap;

import com.bukalapakmobile.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MyLapakAdapter extends BaseAdapter {
    
    private Activity activity;
    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater=null;
    //public ImageLoader imageLoader; 
    
    HashMap<String, String> product;
    
    //CheckBox check_product;
    ImageView image_product;
    TextView name_product;
    TextView ifsold_product;
    TextView stock_product;
    TextView price_product;
    //Button edit_product;
    public MyLapakAdapter(Activity a, ArrayList<HashMap<String, String>> d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
   //     imageLoader=new ImageLoader(activity.getApplicationContext());
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }
    /*
    
        // Setting all values in listview
        title.setText(song.get(CustomizedListView.KEY_TITLE));
        artist.setText(song.get(CustomizedListView.KEY_ARTIST));
        duration.setText(song.get(CustomizedListView.KEY_DURATION));
        imageLoader.DisplayImage(song.get(CustomizedListView.KEY_THUMB_URL), thumb_image);
        return vi;
    }*/

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View vi = convertView;
		
		if(convertView==null){
			vi = inflater.inflate(R.layout.view_product_list_item, null);
		}
		
		 //check_product = (CheckBox)vi.findViewById(R.id.check_product_mylapak);
		 image_product = (ImageView)vi.findViewById(R.id.image_product_mylapak);
		 name_product = (TextView)vi.findViewById(R.id.title_product_mylapak);
		 ifsold_product = (TextView)vi.findViewById(R.id.status_product_mylapak);
		 stock_product = (TextView)vi.findViewById(R.id.stock_product_mylapak);
		 price_product = (TextView)vi.findViewById(R.id.price_product_mylapak);
		 //edit_product = (Button)vi.findViewById(R.id.btn_edit_product_mylapak);
		 
		 product = new HashMap<String, String>();
		 product = data.get(position);

		 // Setting all values in listview
		 name_product.setText(product.get(MyLapakListView.KEY_NAME));
		 ifsold_product.setText(product.get(MyLapakListView.KEY_STATUS));
		 stock_product.setText(product.get(MyLapakListView.KEY_STOCK));
		 price_product.setText(product.get(MyLapakListView.KEY_PRICE));
	     
	    //imageLoader.DisplayImage(song.get(CustomizedListView.KEY_THUMB_URL), thumb_image);
		return vi;
	}
}