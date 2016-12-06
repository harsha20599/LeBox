package com.nitwit.idiot.lebox;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Settings extends AppCompatActivity {

    TextView txt0, txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        txt0 = (TextView)findViewById(R.id.textview_settings_title);
        txt1 = (TextView)findViewById(R.id.textview_footer);

        Typeface GrandHotel = Typeface.createFromAsset(getAssets(), "fonts/GrandHotel-Regular.ttf");
        Typeface BrandonGrotesque = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Regular.ttf");

        txt0.setTypeface(GrandHotel);
        txt1.setTypeface(BrandonGrotesque);
    }
}
