package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.hardware.camera2.CameraDevice;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Tutorials extends AppCompatActivity {
    CardView card;
    TextView titletxt, txt1, txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
        card=(CardView)findViewById(R.id.card_view0);

        titletxt = (TextView)findViewById(R.id.text0);
        txt1 = (TextView)findViewById(R.id.text1);
        txt2 = (TextView)findViewById(R.id.text2);

        Typeface BrandonGrotesque = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Regular.ttf");
        Typeface BrandonGrotesqueBlack = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Black.ttf");

        titletxt.setTypeface(BrandonGrotesqueBlack);
        txt1.setTypeface(BrandonGrotesque);
        txt2.setTypeface(BrandonGrotesque);

    }
    public void Written(View f) {
        Intent next = new Intent(getApplicationContext(), Written.class);
        startActivity(next);
    }
    public void Video(View a) {
        Intent next = new Intent(getApplicationContext(), Video.class);
        startActivity(next);
    }
    public void Color(View a) {
        Random rnd = new Random();
        card.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
    }
}
