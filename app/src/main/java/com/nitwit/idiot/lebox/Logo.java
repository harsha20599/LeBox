package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Logo extends AppCompatActivity {
    ImageView image;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        Intent next=getIntent();
        int num=next.getIntExtra("key",0);
        image=(ImageView)findViewById(R.id.img);
        text=(TextView)findViewById(R.id.text2);
        if(num==1)
        {
            text.setText("MATERIAL LE1S");
            image.setBackgroundResource(R.drawable.materiallogo);
        }
        if(num==2)
        {
            text.setText("GOOGLE");
            image.setBackgroundResource(R.drawable.google);
        }
        if(num==3)
        {
            text.setText("WATCH DOGS");
            image.setBackgroundResource(R.drawable.watchdogs);
        }
    }
}
