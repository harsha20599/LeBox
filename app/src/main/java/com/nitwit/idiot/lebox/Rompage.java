package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Rompage extends AppCompatActivity {
    ImageView image;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rompage);
        Intent next=getIntent();
        int num=next.getIntExtra("key",0);
        image=(ImageView)findViewById(R.id.img);
        text=(TextView)findViewById(R.id.textromname);
        if(num==1)
        {
            text.setText("RR");
            image.setBackgroundResource(R.drawable.rr);
        }
        if(num==2)
        {
            text.setText("MOKEE OS");
            image.setBackgroundResource(R.drawable.mokee);
        }
        if(num==3)
        {
            text.setText("MIUI 8");
            image.setBackgroundResource(R.drawable.miui);
        }
        if(num==4)
        {
            text.setText("EUI");
            image.setBackgroundResource(R.drawable.eui);
        }
    }
}
