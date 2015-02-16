package Adapter;

import com.example.emptyroom.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class gv_main_tab_oneadapter extends BaseAdapter {
	private Context context;
	private String[] names;
	public gv_main_tab_oneadapter(Context context){
		this.context=context;
		names=new String[]{"name1","name2","name3","name4","name5",
				"name6","name7","name8","name9"};
	}
	@Override
	public int getCount() {
		return names.length;
	}

	@Override
	public Object getItem(int arg0) {
		return names[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		viewHolder holder;
		if(arg1==null){
			arg1=LayoutInflater.from(context).inflate(R.layout.gv_layout, null);
			TextView textView=(TextView)arg1.findViewById(R.id.tv_gv_main_tab_one);
			ImageView imageView=(ImageView)arg1.findViewById(R.id.iv_gv_main_tab_one);
			holder=new viewHolder();
			holder.text=textView;
			holder.image=imageView;
			arg1.setTag(holder);
		}else{
			holder=(viewHolder)arg1.getTag();
		}
		holder.text.setText(names[arg0]);
		holder.image.setImageResource(R.drawable.ic_launcher);
		return arg1;
	}
	private static class viewHolder{
		ImageView image;
		TextView  text;
	}
}
