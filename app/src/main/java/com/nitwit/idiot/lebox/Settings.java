package com.nitwit.idiot.lebox;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Settings extends AppCompatActivity {

    TextView txt0, txt1;
    ImageView web,donate,fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        web=(ImageView)findViewById(R.id.web);
        donate=(ImageView)findViewById(R.id.donate);
        fb=(ImageView)findViewById(R.id.fb);

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linkopen = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://zyconut.coolpage.biz/"));
                startActivity(linkopen);
            }
        });

        txt0 = (TextView)findViewById(R.id.textview_settings_title);
        txt1 = (TextView)findViewById(R.id.textview_footer);

        Typeface GrandHotel = Typeface.createFromAsset(getAssets(), "fonts/GrandHotel-Regular.ttf");
        Typeface BrandonGrotesque = Typeface.createFromAsset(getAssets(), "fonts/BrandonGrotesque-Regular.ttf");

        txt0.setTypeface(GrandHotel);
        txt1.setTypeface(BrandonGrotesque);
    }
    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://profile/1219923331420244"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/zyconut/"));
        }
    }
    public void fb(View a)
    {
        Intent facebookIntent = getOpenFacebookIntent(this);
        startActivity(facebookIntent);
    }
}
