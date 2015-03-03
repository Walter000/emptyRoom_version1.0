package Adapter.adapter;

import java.util.List;

import com.example.emptyroom.R;

import Adapter.entity.main_tab_three_lvadapter_entity;
import android.content.Context;
import android.provider.ContactsContract.Contacts.Data;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class lv_main_tab_three_needP_adapter extends BaseAdapter {
	private Context context;
	private List<main_tab_three_lvadapter_entity> entities;
	public lv_main_tab_three_needP_adapter(Context context,List<main_tab_three_lvadapter_entity> entities){
		this.context=context;
		this.entities=entities;
	}
	@Override
	public int getCount() {
		return entities.size();
	}

	@Override
	public Object getItem(int arg0) {
		return entities.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		viewHolder holder;
		main_tab_three_lvadapter_entity entity=entities.get(arg0);
		if(arg1==null){
			arg1=LayoutInflater.from(context).inflate(R.layout.lv_main_tab_three, null);
			ImageView image1=(ImageView)arg1.findViewById(R.id.iv_main_tab_three);
			TextView address=(TextView)arg1.findViewById(R.id.tv_main_tab_three_address);
			TextView name=(TextView)arg1.findViewById(R.id.tv_main_tab_three_name);
			TextView rating=(TextView)arg1.findViewById(R.id.tv_main_tab_three_rating);
			TextView attention=(TextView)arg1.findViewById(R.id.tv_main_tab_three_attentionNumber);
			holder=new viewHolder();
			holder.image1=image1;
			holder.address=address;
			holder.name=name;
			holder.rating=rating;
			holder.attention=attention;
			arg1.setTag(holder);
		}else{
			holder=(viewHolder)arg1.getTag();
		}
		holder.image1.setImageResource(entity.getPicture());
		holder.address.setText(entity.getAddress());
		holder.name.setText("Ãû³Æ:"+entity.getName());
		holder.rating.setText("ÆÀ¼Û:"+entity.getRating());
		holder.attention.setText("¹Ø×¢:"+entity.getAttention());
		return arg1;
	}
	private static class viewHolder{
		ImageView image1;
		TextView address;
		TextView name;
		TextView rating;
		TextView attention;
	}
}
