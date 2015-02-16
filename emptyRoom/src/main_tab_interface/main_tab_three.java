package main_tab_interface;

import com.example.emptyroom.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class main_tab_three extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.main_menu_three, null);
	};
}
