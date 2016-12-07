package com.nitwit.idiot.lebox;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.left;
import static android.R.attr.right;

public class Dashboard extends AppCompatActivity {

    TextView titletxt, txt1, txt2, txt3, txt4, txt5, txt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        setupWindowAnimations();


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
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        this.startActivity(next,bundle);
    }
    public void Rom(View a)
    {
        Intent next=new Intent(getApplicationContext(),Rom.class);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        this.startActivity(next,bundle);
    }
    public void Recovery(View a)
    {
        Intent next=new Intent(getApplicationContext(),Recovery.class);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        this.startActivity(next,bundle);
    }
    public void Gapps(View a)
    {
        Intent next=new Intent(getApplicationContext(),Gapps.class);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        this.startActivity(next,bundle);
    }
    public void Bootanim(View a)
    {
        Intent next=new Intent(getApplicationContext(),Bootanimation.class);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        this.startActivity(next,bundle);
    }
    public void Bootlogo(View a)
    {
        Intent next=new Intent(getApplicationContext(),Bootlogo.class);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        this.startActivity(next,bundle);
    }
    public void Settings(View a)
    {
        Intent next=new Intent(getApplicationContext(), Settings.class);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        this.startActivity(next,bundle);
    }
    private void setupWindowAnimations()
    {
        Fade fade = new Fade();
        fade.setDuration(200);
        getWindow().setExitTransition(fade);

        Slide slide = new Slide(3);
        slide.setDuration(200);
        getWindow().setReenterTransition(slide);
    }
}
