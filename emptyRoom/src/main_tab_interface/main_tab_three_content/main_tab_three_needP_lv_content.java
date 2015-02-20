package main_tab_interface.main_tab_three_content;

import Adapter.adapter.gl_main_tab_three_needP_lv_content_showadapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.emptyroom.R;

public class main_tab_three_needP_lv_content extends Activity {
	private ImageView  picture;
	private TextView name,rating,attention;
	private Gallery gallery;
	private int pic_src;
	private int[] imgData;
	private String name_src,rating_src,attention_src;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_tab_three_needp_lv_content);
		initView();
		getData();
		initData();
	}
	public void initView(){
		gallery=(Gallery)findViewById(R.id.gl_main_tab_three_needP_lv_content);
		picture=(ImageView)findViewById(R.id.iv_main_tab_three_needP_lv_content);
		name=(TextView)findViewById(R.id.tv_main_tab_three_needP_lv_content_name);
		rating=(TextView)findViewById(R.id.tv_main_tab_three_needP_lv_content_rating);
		attention=(TextView)findViewById(R.id.tv_main_tab_three_needP_lv_content_attention);
	}
	public void getData(){
		Intent intent=getIntent();
		Bundle bundle=intent.getExtras();
		pic_src=bundle.getInt("picture");
		name_src=bundle.getString("name");
		rating_src=bundle.getString("rating");
		attention_src=bundle.getString("attention");
		imgData=new int[]{R.drawable.adone,R.drawable.adtwo,R.drawable.adtwo};
	}
	public void initData(){
		picture.setImageResource(pic_src);
		name.setText("Ãû³Æ:"+name_src);
		rating.setText("ÆÀ¼Û:"+rating_src);
		attention.setText("¹Ø×¢:"+attention_src);
		gallery.setAdapter(new gl_main_tab_three_needP_lv_content_showadapter(this, imgData));
	}
	public void goChat(View v){
		Intent intent=new Intent(main_tab_three_needP_lv_content.this,chatActivity.class);
		startActivity(intent);
	}
}
