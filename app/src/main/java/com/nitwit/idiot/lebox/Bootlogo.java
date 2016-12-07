package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.transition.Fade;
import android.transition.Slide;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Bootlogo extends AppCompatActivity {
    CardView info,card1,card2,card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bootlogo);
        setupWindowAnimations();

        info=(CardView)findViewById(R.id.card_viewinfo);
        card1=(CardView)findViewById(R.id.card_view1);
        card2=(CardView)findViewById(R.id.card_view2);
        card3=(CardView)findViewById(R.id.card_view3);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Logopage.class);
                next.putExtra("key",1);
                startActivity(next);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Logopage.class);
                next.putExtra("key",2);
                startActivity(next);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Logopage.class);
                next.putExtra("key",3);
                startActivity(next);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(getApplicationContext(),Info.class);
                next.putExtra("key",5);
                startActivity(next);
            }
        });
    }
    private void setupWindowAnimations()
    {
        Slide slide = new Slide(5);
        slide.setDuration(200);
        getWindow().setEnterTransition(slide);

        Fade fade = new Fade();
        fade.setDuration(200);
        getWindow().setReturnTransition(fade);

        Slide slide2 = new Slide(3);
        slide2.setDuration(200);
        getWindow().setReenterTransition(slide2);
    }
}
