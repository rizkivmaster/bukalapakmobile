package view.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//sumber:http://www.ezzylearning.com/tutorial.aspx?tid=1763429&q=customizing-android-listview-items-with-custom-arrayadapter
public class DashboardAdapter extends ArrayAdapter<DashboardItem>{

    Context context; 
    int layoutResourceId;    
    DashboardItem data[] = null;
    
    public DashboardAdapter(Context context, int layoutResourceId, DashboardItem[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        DashboardHolder holder = null;
        /*
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new DashboardHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
            
            row.setTag(holder);
        }
        else
        {
            holder = (DashboardHolder)row.getTag();
        }
        
        DashboardItem dashboardItem = data[position];
        holder.txtTitle.setText(dashboardItem.title);
        holder.imgIcon.setImageResource(dashboardItem.icon);
        */
        return row;
    }
    
    static class DashboardHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}
