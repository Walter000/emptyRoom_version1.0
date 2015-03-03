package main_tab_interface.main_tab_one_content;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

import com.example.emptyroom.R;

public class main_menu_one_add extends Activity {
	private ImageButton ib_title_back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_menu_one_add);
		ib_title_back=(ImageButton)findViewById(R.id.ib_title_back);
		ib_title_back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				finish();
			}
		});

	}
}
