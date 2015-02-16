package main_tab_interface;

import main_tab_one.main_menu_one_add;
import Adapter.gv_main_tab_oneadapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.emptyroom.R;

public class main_tab_one extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.main_menu_one, null);
		ImageButton ib=(ImageButton)view.findViewById(R.id.ib_title_add);
		GridView gv=(GridView)view.findViewById(R.id.gv_main_tab_one);
		gv.setAdapter(new gv_main_tab_oneadapter(getActivity()));
		ib.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(getActivity(),main_menu_one_add.class);
				startActivity(intent);
			}
		});
		return (view);
	};
}
