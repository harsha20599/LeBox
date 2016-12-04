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
    private int[] images={R.drawable.google,R.drawable.watchdogs,R.drawable.materiallogo};
    private Context ctx;
    private LayoutInflater layoutInflater;
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
        TextView textView=(TextView)item_view.findViewById(R.id.imagecount);
        imageView.setBackgroundResource(images[position]);
        textView.setText("Image : "+position );
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

}
