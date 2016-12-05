package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Rompage extends AppCompatActivity {
    ImageView image;
    TextView textrom,feature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rompage);
        Intent next=getIntent();
        int num=next.getIntExtra("key",0);
        image=(ImageView)findViewById(R.id.img);
        textrom=(TextView)findViewById(R.id.text_romname);
        feature=(TextView)findViewById(R.id.text_feature);
        if(num==1)
        {
            feature.setText("Highly customisable" +
                    "cm based" +
                    "rr open source" +
                    "hfaadasda" +
                    "safasfafsas" +
                    "asfasffasfsa");
            textrom.setText("RR");
            image.setBackgroundResource(R.drawable.rr);
        }
        if(num==2)
        {
            feature.setText("Highly customisable" +
                    "cm based" +
                    "mokee open source" +
                    "hfaadasda" +
                    "safasfafsas" +
                    "asfasffasfsa");
            textrom.setText("MOKEE OS");
            image.setBackgroundResource(R.drawable.mokee);
        }
        if(num==3)
        {
            feature.setText("Highly customisable" +
                    "miui based" +
                    "miui open source" +
                    "hfaadasda" +
                    "safasfafsas" +
                    "asfasffasfsa");
            textrom.setText("MIUI 8");
            image.setBackgroundResource(R.drawable.miui);
        }
        if(num==4)
        {
            feature.setText("Highly customisable" +
                    "eui based" +
                    "eui open source" +
                    "hfaadasda" +
                    "safasfafsas" +
                    "asfasffasfsa");
            textrom.setText("EUI");
            image.setBackgroundResource(R.drawable.eui);
        }
        if(num==5)
        {
            feature.setText("Highly customisable" +
                    "cos based" +
                    "coloros open source" +
                    "hfaadasda" +
                    "safasfafsas" +
                    "asfasffasfsa");
            textrom.setText("Color OS");
            image.setBackgroundResource(R.drawable.coloros);
        }
        if(num==6)
        {
            feature.setText("Highly customisable" +
                    "fos based" +
                    "flyme os open source" +
                    "hfaadasda" +
                    "safasfafsas" +
                    "asfasffasfsa");
            textrom.setText("Flyme Os");
            image.setBackgroundResource(R.drawable.flymeos);
        }

    }
}
