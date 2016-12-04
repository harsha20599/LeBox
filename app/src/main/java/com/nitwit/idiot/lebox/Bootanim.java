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

public class Bootanim extends AppCompatActivity {

    CardView card1,card2,card3;
    TextView titletxt, txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bootanim);
        card1 = (CardView)findViewById(R.id.card_view1);
        card2 = (CardView)findViewById(R.id.card_view2);
        card3 = (CardView)findViewById(R.id.card_view3);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Animation.class);
                next.putExtra("key",1);
                startActivity(next);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Animation.class);
                next.putExtra("key",2);
                startActivity(next);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Animation.class);
                next.putExtra("key",3);
                startActivity(next);
            }
        });

        titletxt = (TextView)findViewById(R.id.text0);
        txt1 = (TextView)findViewById(R.id.text1);
        txt2 = (TextView)findViewById(R.id.text2);
        txt3 = (TextView)findViewById(R.id.text3);

        Typeface BrandonGrotesque = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Regular.ttf");
        Typeface BrandonGrotesqueBlack = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Black.ttf");

        titletxt.setTypeface(BrandonGrotesqueBlack);
        txt1.setTypeface(BrandonGrotesque);
        txt2.setTypeface(BrandonGrotesque);
        txt3.setTypeface(BrandonGrotesque);
    }


}
