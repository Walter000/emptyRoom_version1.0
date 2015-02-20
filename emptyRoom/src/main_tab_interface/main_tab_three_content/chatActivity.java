package main_tab_interface.main_tab_three_content;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.example.emptyroom.*;

import Adapter.adapter.chat_main_adapter;
import Adapter.entity.chat_main_entity;
import android.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class chatActivity extends Activity {
	private List<chat_main_entity> entities;
	private ListView chat_main;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
		setContentView(R.layout.chat_main);
		initView();
		getData();
		initData();
	}
	private void initView(){
		chat_main=(ListView)findViewById(R.id.lv_chat_main);
	}
	private void getData(){
		entities=new ArrayList<chat_main_entity>();
		for(int i=1;i<15;i++){
			if(i%2==0){
				chat_main_entity entity=new chat_main_entity(true, R.drawable.adtwo, "聊天内容", getDate());
				entities.add(entity);
			}else{
				chat_main_entity entity=new chat_main_entity(false, R.drawable.adtwo, "聊天内容", getDate());
				entities.add(entity);
			}
			
		}
	}
	private String getDate(){
		String date="";
		Calendar calendar=Calendar.getInstance();
		String year=String.valueOf(calendar.get(Calendar.YEAR));
		String month=String.valueOf(calendar.get(Calendar.MONTH)+1);
		String day=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
		String hour=String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
		String minute=String.valueOf(calendar.get(Calendar.MINUTE));
		String second=String.valueOf(calendar.get(Calendar.SECOND));
		date=year+"/"+month+"/"+day+"/"+hour+":"+minute+":"+second;
		return date;
	}
	private void initData(){
		chat_main.setAdapter(new chat_main_adapter(this, entities));
	}
}
