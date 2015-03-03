package Adapter.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class gl_main_tab_three_needP_lv_content_showadapter extends BaseAdapter {
	private int imgData[];
	private Context context;
	public gl_main_tab_three_needP_lv_content_showadapter(Context context,int[] imgData){
		this.context=context;
		this.imgData=imgData;
	}
	@Override
	public int getCount() {
		return imgData.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return imgData[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		ImageView imageView=new ImageView(context);
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setLayoutParams(new Gallery.LayoutParams(200, 100));
		imageView.setImageResource(imgData[arg0]);
		return imageView;
	}

}
