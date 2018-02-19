package com.example.f1l.f2018;

import android.content.Context;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by F1L on 02.02.2017.
 */

public class customSwip extends PagerAdapter{
    private int [] imageResources = {R.drawable.logo1,R.drawable.logo2,R.drawable.logo3,R.drawable.logo4,R.drawable.logo5,R.drawable.logo6,R.drawable.logo7,R.drawable.logo8,R.drawable.logo9,R.drawable.logo10};
    private Context ctx;

    public customSwip(Context c) {
        ctx = c;
    }

    @Override
    public int getCount() {
        return imageResources.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.activity_custom_swip,container,false);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.swip_image_view);
        /*TextView textview = (TextView) itemView.findViewById(R.id.imageCount);*/
        imageView.setImageResource(imageResources[position]);
        /*textView.setText("Image count"+position);*/
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==object);
    }
}
