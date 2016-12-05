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

public class Rom extends AppCompatActivity {

    TextView titletxt, txt0, txt1, txt2, txt3, txt4,txt5,txt6;
    CardView card,card1,card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rom);
        card=(CardView)findViewById(R.id.card_view0);
        card1 = (CardView)findViewById(R.id.card_view1);
        card2 = (CardView)findViewById(R.id.card_view2);
        card3 = (CardView)findViewById(R.id.card_view3);
        card4 = (CardView)findViewById(R.id.card_view4);
        card5 = (CardView)findViewById(R.id.card_view5);
        card6 = (CardView)findViewById(R.id.card_view6);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Rompage.class);
                next.putExtra("key",1);
                startActivity(next);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Rompage.class);
                next.putExtra("key",2);
                startActivity(next);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Rompage.class);
                next.putExtra("key",3);
                startActivity(next);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Rompage.class);
                next.putExtra("key",4);
                startActivity(next);
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Rompage.class);
                next.putExtra("key",5);
                startActivity(next);
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Rompage.class);
                next.putExtra("key",6);
                startActivity(next);
            }
        });

        titletxt = (TextView)findViewById(R.id.text_heading_roms);
        txt0 = (TextView)findViewById(R.id.text_aboutrom);
        txt1 = (TextView)findViewById(R.id.text_resurrectionremix);
        txt2 = (TextView)findViewById(R.id.text_mokeeos);
        txt3 = (TextView)findViewById(R.id.text_miui8);
        txt4 = (TextView)findViewById(R.id.text_euimm);
        txt5 = (TextView)findViewById(R.id.text_coloros);
        txt6 = (TextView)findViewById(R.id.text_flymmeos);

        Typeface BrandonGrotesque = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Regular.ttf");
        Typeface BrandonGrotesqueBlack = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Black.ttf");

        titletxt.setTypeface(BrandonGrotesqueBlack);
        txt0.setTypeface(BrandonGrotesque);
        txt1.setTypeface(BrandonGrotesque);
        txt2.setTypeface(BrandonGrotesque);
        txt3.setTypeface(BrandonGrotesque);
        txt4.setTypeface(BrandonGrotesque);
        txt5.setTypeface(BrandonGrotesque);
        txt6.setTypeface(BrandonGrotesque);
    }


}
