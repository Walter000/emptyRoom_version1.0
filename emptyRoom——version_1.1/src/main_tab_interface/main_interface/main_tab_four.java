package main_tab_interface.main_interface;

import com.example.emptyroom.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

public class main_tab_four extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.main_menu_four, null);
		final ImageView picture=(ImageView)view.findViewById(R.id.iv_picture);
		picture.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				ScaleAnimation animation=new ScaleAnimation(1.0f, 3.0f, 1.0f,3.0f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 0f);
				animation.setDuration(1000);
				animation.setFillEnabled(true);
				picture.startAnimation(animation);
			}
		});
		return view;
	};
}
