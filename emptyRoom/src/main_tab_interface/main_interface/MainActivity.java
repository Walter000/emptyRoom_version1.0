package main_tab_interface.main_interface;

import main_tab_interface.main_tab_three_content.main_tab_three_needP;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.example.emptyroom.R;

public class MainActivity extends FragmentActivity {
	private RadioGroup radio;
	private RadioButton radioButton;
	private ImageButton ib_title_add,ib_title_back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		radioButton=(RadioButton)findViewById(R.id.rb_main_menu_one);
		radioButton.setChecked(true);
		init();
	}
	public void init(){
		radio=(RadioGroup)findViewById(R.id.main_menu);
		getSupportFragmentManager().beginTransaction().replace(R.id.main_content, new main_tab_one()).commit();
		radio.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				switch(arg1){
				case R.id.rb_main_menu_one:	getSupportFragmentManager().
				beginTransaction().replace(R.id.main_content, new main_tab_one()).commit();
				break;
				case R.id.rb_main_menu_two:getSupportFragmentManager().
				beginTransaction().replace(R.id.main_content, new main_tab_two()).commit();
				break;
				case R.id.rb_main_menu_three:getSupportFragmentManager().
				beginTransaction().replace(R.id.main_content, new main_tab_three()).commit();
				break;
				case R.id.rb_main_menu_four:getSupportFragmentManager().
				beginTransaction().replace(R.id.main_content, new main_tab_four()).commit();
				break;
				}
			}
		});
	}
	public void need_photographer(View v){
		Intent intent=new Intent(this,main_tab_three_needP.class);
		startActivity(intent);
	}
	
}
