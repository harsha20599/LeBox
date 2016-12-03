package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Recovery extends AppCompatActivity {

    TextView titletxt, txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);

        titletxt = (TextView)findViewById(R.id.text0);
        txt1 = (TextView)findViewById(R.id.text1);
        txt2 = (TextView)findViewById(R.id.text2);

        Typeface BrandonGrotesque = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Regular.ttf");
        Typeface BrandonGrotesqueBlack = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Black.ttf");

        titletxt.setTypeface(BrandonGrotesqueBlack);
        txt1.setTypeface(BrandonGrotesque);
        txt2.setTypeface(BrandonGrotesque);
    }
    public void TWRP(View a)
    {
        Intent next=new Intent(getApplicationContext(),TWRP.class);
        startActivity(next);
    }
}
