package Adapter.adapter;

import com.example.emptyroom.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class lv_main_tab_twoadapter extends BaseAdapter {
	private Context context;
	private String[] dates;
	public lv_main_tab_twoadapter(Context context){
		this.context=context;
		dates=new String[]{"2/1","2/2","2/3","2/4","2/5","2/6","2/7",
				"2/8","2/9","2/10"};
	}
	@Override
	public int getCount() {
		return dates.length;
	}

	@Override
	public Object getItem(int arg0) {
		return dates[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		viewHolder holder;
		if(arg1==null){
			arg1=LayoutInflater.from(context).inflate(R.layout.lv_main_tab_two, null);
			ImageView image1=(ImageView)arg1.findViewById(R.id.iv_main_tab_two);
			ImageView image2=(ImageView)arg1.findViewById(R.id.iv_main_tab_two2);
			TextView date=(TextView)arg1.findViewById(R.id.tv_main_tab_two_date);
			holder=new viewHolder();
			holder.image1=image1;
			holder.image2=image2;
			holder.date=date;
			arg1.setTag(holder);
		}else{
			holder=(viewHolder)arg1.getTag();
		}
		holder.image1.setImageResource(R.drawable.adone);
		holder.image2.setImageResource(R.drawable.adtwo);
		holder.date.setText(dates[arg0]);
		return arg1;
	}
	private static class viewHolder{
		ImageView image1;
		ImageView image2;
		TextView date;
	}
}
