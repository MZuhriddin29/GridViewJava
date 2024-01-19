package com.example.gridviewjava;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Array of resource IDs (assuming you have image resources in your project)
    private Integer[] mThumbIds = {
            R.drawable.image1, R.drawable.image2, R.drawable.image3,
            R.drawable.image3, R.drawable.image1, R.drawable.image2,
            R.drawable.image2, R.drawable.image3, R.drawable.image1,
            // Add more image resources as needed
    };

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // Create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // If it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500)); // Adjust size as needed
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(1, 1, 1, 1);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
}
