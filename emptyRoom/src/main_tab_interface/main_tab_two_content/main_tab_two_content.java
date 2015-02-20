package main_tab_interface.main_tab_two_content;

import com.example.emptyroom.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class main_tab_two_content extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_tab_two_content);
	}
}
