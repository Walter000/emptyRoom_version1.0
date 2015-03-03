package main_tab_interface.main_interface;

import main_tab_interface.main_tab_two_content.main_tab_two_content;
import Adapter.adapter.lv_main_tab_twoadapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.emptyroom.R;

public class main_tab_two extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.main_menu_two, null);
		ListView listView=(ListView)view.findViewById(R.id.lv_main_menu_shoucang);
		listView.setAdapter(new lv_main_tab_twoadapter(getActivity()));
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent intent=new Intent(getActivity(),main_tab_two_content.class);
				startActivity(intent);
			}
		});
		return view;
	};
}
