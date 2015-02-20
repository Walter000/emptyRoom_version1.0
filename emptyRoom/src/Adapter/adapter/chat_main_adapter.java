package Adapter.adapter;

import java.util.List;

import Adapter.entity.chat_main_entity;
import com.example.emptyroom.*;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class chat_main_adapter extends BaseAdapter {
	private Context context;
	private List<chat_main_entity> entities;
	public chat_main_adapter(Context context,List<chat_main_entity> entities){
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
		chat_main_entity entity=entities.get(arg0);
		if(arg1==null){
			if(entity.isSelf()){
				arg1=LayoutInflater.from(context).inflate(R.layout.chat_right, null);
			}else{
				arg1=LayoutInflater.from(context).inflate(R.layout.chat_left, null);
			}
			TextView date=(TextView)arg1.findViewById(R.id.tv_chat_time);
			ImageView photo=(ImageView)arg1.findViewById(R.id.iv_chat_photo);
			TextView content=(TextView)arg1.findViewById(R.id.tv_chat_content);
			holder=new viewHolder();
			holder.photo=photo;
			holder.date=date;
			holder.content=content;
			arg1.setTag(holder);
		}else{
			holder=(viewHolder)arg1.getTag();
		}
		holder.date.setText(entity.getDate());
		holder.content.setText(entity.getContent());
		holder.photo.setImageResource(entity.getPhoto());
		return arg1;
	}
	private static class viewHolder{
		ImageView photo;
		TextView date;
		TextView content;
	}

}
