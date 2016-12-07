package com.nitwit.idiot.lebox;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by rajat on 12/4/2016.
 */

public class Customswipeadapter extends PagerAdapter {
    private int[] images={R.drawable.google1,R.drawable.google2,R.drawable.google3,R.drawable.google4,R.drawable.google5};
    private Context ctx;
    private LayoutInflater layoutInflater;
    TextView animation_name;
    public Customswipeadapter(Context ctx)
    {
        this.ctx=ctx;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view=layoutInflater.inflate(R.layout.swipe,container,false);
        ImageView imageView=(ImageView)item_view.findViewById(R.id.image_view);
        imageView.setBackgroundResource(images[position]);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

}
