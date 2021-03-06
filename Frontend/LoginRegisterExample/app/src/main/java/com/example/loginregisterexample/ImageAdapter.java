package com.example.loginregisterexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter{

    private Context mContext;

    private Integer[] mThumbIds = {
            R.drawable.c, R.drawable.e,
            R.drawable.c, R.drawable.e,
            R.drawable.c, R.drawable.e,
            R.drawable.c, R.drawable.e,
            R.drawable.c, R.drawable.e,
            R.drawable.c, R.drawable.e,
            R.drawable.pizza_icon, R.drawable.pizza_icon,
            R.drawable.pizza_icon, R.drawable.pizza_icon,
            R.drawable.pizza_icon, R.drawable.pizza_icon,
            R.drawable.pizza_icon, R.drawable.pizza_icon,
            R.drawable.pizza_icon, R.drawable.pizza_icon
    };

    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if(convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85,85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }else{
            imageView = (ImageView)convertView;
        }

        imageView.setImageResource(mThumbIds[position]);

        return imageView;
    }

}
