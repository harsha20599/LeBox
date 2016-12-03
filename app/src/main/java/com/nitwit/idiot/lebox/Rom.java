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

    TextView titletxt, txt1, txt2, txt3, txt4;
    CardView card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rom);

        card = (CardView)findViewById(R.id.card0);
        titletxt = (TextView)findViewById(R.id.text0);
        txt1 = (TextView)findViewById(R.id.text1);
        txt2 = (TextView)findViewById(R.id.text2);
        txt3 = (TextView)findViewById(R.id.text3);
        txt4 = (TextView)findViewById(R.id.text4);

        Typeface BrandonGrotesque = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Regular.ttf");
        Typeface BrandonGrotesqueBlack = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Black.ttf");

        titletxt.setTypeface(BrandonGrotesqueBlack);
        txt1.setTypeface(BrandonGrotesque);
        txt2.setTypeface(BrandonGrotesque);
        txt3.setTypeface(BrandonGrotesque);
        txt4.setTypeface(BrandonGrotesque);
    }
    public void RompageRR(View a)
    {
        Intent next = new Intent(getApplicationContext(), RR.class);
        startActivity(next);
    }
    public void RompageMokee(View a)
    {
        Intent next = new Intent(getApplicationContext(), Mokee.class);
        startActivity(next);
    }
    public void RompageMiui(View a)
    {
        Intent next = new Intent(getApplicationContext(), Miui.class);
        startActivity(next);
    }
    public void RompageEui(View a)
    {
        Intent next = new Intent(getApplicationContext(), Eui.class);
        startActivity(next);
    }
    public void Color(View a) {
        Random rnd = new Random();
        card.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
    }
}
