package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    TextView titletxt, txt1, txt2, txt3, txt4, txt5, txt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        titletxt = (TextView) findViewById(R.id.text_lebox);
        txt1 = (TextView)findViewById(R.id.text_tutorial);
        txt2 = (TextView)findViewById(R.id.text_rom);
        txt3 = (TextView)findViewById(R.id.text_recovery);
        txt4 = (TextView)findViewById(R.id.text_gapps);
        txt5 = (TextView)findViewById(R.id.text_bootanimation);
        txt6 = (TextView)findViewById(R.id.text_bootlogo);

        Typeface GrandHotel = Typeface.createFromAsset(getAssets(), "fonts/GrandHotel-Regular.ttf");
        Typeface BrandonGrotesque = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Regular.ttf");

        titletxt.setTypeface(GrandHotel);
        txt1.setTypeface(BrandonGrotesque);
        txt2.setTypeface(BrandonGrotesque);
        txt3.setTypeface(BrandonGrotesque);
        txt4.setTypeface(BrandonGrotesque);
        txt5.setTypeface(BrandonGrotesque);
        txt6.setTypeface(BrandonGrotesque);

    }
    public void Tutorial(View a)
    {
        Intent next=new Intent(getApplicationContext(),Tutorials.class);
        startActivity(next);
    }
    public void Rom(View a)
    {
        Intent next=new Intent(getApplicationContext(),Rom.class);
        startActivity(next);
    }
    public void Recovery(View a)
    {
        Intent next=new Intent(getApplicationContext(),Recovery.class);
        startActivity(next);
    }
    public void Gapps(View a)
    {
        Intent next=new Intent(getApplicationContext(),Gapps.class);
        startActivity(next);
    }
    public void Bootanim(View a)
    {
        Intent next=new Intent(getApplicationContext(),Bootanimation.class);
        startActivity(next);
    }
    public void Bootlogo(View a)
    {
        Intent next=new Intent(getApplicationContext(),Bootlogo.class);
        startActivity(next);
    }
    public void Settings(View a)
    {
        Intent next=new Intent(getApplicationContext(), Settings.class);
        startActivity(next);
    }
}
