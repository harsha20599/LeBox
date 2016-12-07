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
import android.widget.Toast;

import java.util.Random;

public class Recovery extends AppCompatActivity {
    CardView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);
        setupWindowAnimations();

        Toast.makeText(getApplicationContext(),"Long press to Download",Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"Long press to Download",Toast.LENGTH_LONG).show();
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
