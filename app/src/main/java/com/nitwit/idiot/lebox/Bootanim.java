package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Bootanim extends AppCompatActivity {
    ViewPager viewPager;
    Customswipeadapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bootanim);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        adapter=new Customswipeadapter(this);
        viewPager.setAdapter(adapter);


    }



}