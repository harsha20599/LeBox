package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Recovery extends AppCompatActivity {
    CardView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);
        info=(CardView)findViewById(R.id.card_viewinfo);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Info.class);
                next.putExtra("key",2);
                startActivity(next);
            }
        });

    }



}
