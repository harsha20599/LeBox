package com.nitwit.idiot.lebox;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Bootanimation extends AppCompatActivity {
    ViewPager viewPager;
    Customswipeadapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bootanimation);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        adapter=new Customswipeadapter(this);
        viewPager.setAdapter(adapter);


    }



}