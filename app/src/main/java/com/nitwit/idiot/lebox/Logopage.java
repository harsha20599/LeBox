package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class Logopage extends AppCompatActivity {
    ViewPager viewPager;
    CardView download;
    Customswipeadapter adapter;
    Customswipeadapter2 adapter2;
    Customswipeadapter3 adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logopage);
        Toast.makeText(getApplicationContext(),"Slide to see more images",Toast.LENGTH_SHORT).show();
        Intent next=getIntent();
        int num=next.getIntExtra("key",0);
        download=(CardView)findViewById(R.id.card_view2);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Downloading",Toast.LENGTH_SHORT).show();
            }
        });
        if(num==1)
        {
            viewPager = (ViewPager) findViewById(R.id.view_pager);
            adapter = new Customswipeadapter(this);
            viewPager.setAdapter(adapter);
        }
        if(num==2)
        {
            viewPager = (ViewPager) findViewById(R.id.view_pager);
            adapter2 = new Customswipeadapter2(this);
            viewPager.setAdapter(adapter2);
        }
        if(num==3)
        {
            viewPager = (ViewPager) findViewById(R.id.view_pager);
            adapter3 = new Customswipeadapter3(this);
            viewPager.setAdapter(adapter3);
        }
    }
}
