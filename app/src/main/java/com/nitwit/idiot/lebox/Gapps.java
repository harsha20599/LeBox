package com.nitwit.idiot.lebox;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Gapps extends AppCompatActivity {
    CardView info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gapps);
        Toast.makeText(getApplicationContext(),"Long press to Download",Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"Long press to Download",Toast.LENGTH_LONG).show();
        info=(CardView)findViewById(R.id.card_viewinfo);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Info.class);
                next.putExtra("key",3);
                startActivity(next);
            }
        });

    }

}
