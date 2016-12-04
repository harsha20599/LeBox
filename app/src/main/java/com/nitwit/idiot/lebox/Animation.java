package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Animation extends AppCompatActivity {
    ImageView image;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        Intent next=getIntent();
        int num=next.getIntExtra("key",0);
        image=(ImageView)findViewById(R.id.img);
        text=(TextView)findViewById(R.id.text2);
        if(num==1)
        {
            text.setText("ANIM 1");
            image.setBackgroundResource(R.drawable.materiallogo);
        }
        if(num==2)
        {
            text.setText("ANIM 2");
            image.setBackgroundResource(R.drawable.google);
        }
        if(num==3)
        {
            text.setText("ANIM 3");
            image.setBackgroundResource(R.drawable.watchdogs);
        }
    }
}
