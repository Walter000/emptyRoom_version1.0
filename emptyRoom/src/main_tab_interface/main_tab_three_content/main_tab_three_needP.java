package main_tab_interface.main_tab_three_content;

import java.util.ArrayList;
import java.util.List;

import Adapter.adapter.lv_main_tab_three_needP_adapter;
import Adapter.entity.main_tab_three_lvadapter_entity;
import android.R.integer;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.example.emptyroom.R;

public class main_tab_three_needP extends Activity {
	private Button btn_price,btn_comment,btn_attention,btn_search;
	private PopupWindow popup_price;
	private List<main_tab_three_lvadapter_entity> entities;
	private ListView listView;
	private boolean isDisplay=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_tab_three_needp);
		initView();
		initEntity();
		initListeners();
	}
	public void initView(){
		btn_price=(Button)findViewById(R.id.btn_main_tab_three_needP_price);
		btn_comment=(Button)findViewById(R.id.btn_main_tab_three_needP_comment);
		btn_attention=(Button)findViewById(R.id.btn_main_tab_three_needP_attention);
		btn_search=(Button)findViewById(R.id.btn_main_tab_three_needP_search);
		listView=(ListView)findViewById(R.id.lv_main_tab_three_needP);
	}
	public void initListeners(){
		btn_price.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
					popup_price();
			}
		});
		listView.setAdapter(new lv_main_tab_three_needP_adapter(this,entities));
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				main_tab_three_lvadapter_entity item=entities.get(arg2);
				Intent intent=new Intent(main_tab_three_needP.this,main_tab_three_needP_lv_content.class);
				Bundle bundle=new Bundle();
				bundle.putInt("picture", item.getPicture());
				bundle.putString("name", item.getName());
				bundle.putString("address", item.getAddress());
				bundle.putString("rating", item.getRating());
				bundle.putString("attention", item.getAttention());
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
	}
	public void initEntity(){
		entities=new ArrayList<main_tab_three_lvadapter_entity>();
		for(int i=0;i<10;i++){
			main_tab_three_lvadapter_entity entity=new main_tab_three_lvadapter_entity(R.drawable.adone, 
					"ÉÏº£ÑîÆÖ", "name", "****", "100ÈË");
			entities.add(entity);
		}
	}
	public void popup_price(){
		View view=LayoutInflater.from(this).inflate(R.layout.main_tab_three_needp_price, null);
		if(!isDisplay){
			popup_price=new PopupWindow(view, LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
			popup_price.setFocusable(false);
			popup_price.setOutsideTouchable(true);
			popup_price.setBackgroundDrawable(new BitmapDrawable());
			popup_price.showAsDropDown(btn_price);
			popup_price.update();
			isDisplay=true;
			
		}else{
			popup_price.dismiss();
			isDisplay=false;
		}
	}
}
