package view.home;

import com.bukalapakmobile.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Dashboard2 extends BaseHeader {

    private ListView listView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);
        
        DashboardItem dashboard_data[] = new DashboardItem[]
        {
            new DashboardItem(R.drawable.home, "Jual Barang"),
            new DashboardItem(R.drawable.home, "My Lapak"),
            new DashboardItem(R.drawable.home, "Transaksi"),
            new DashboardItem(R.drawable.home, "Pesan")
        };
        /*
        DashboardAdapter adapter = new DashboardAdapter(this, 
                R.layout.listview_item_row, dashboard_data);
        
        
        listView1 = (ListView)findViewById(R.id.listView1);
        
        View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row, null);
        listView1.addHeaderView(header);
        
        setHeader();
        
        listView1.setAdapter(adapter);
        */
    }
}