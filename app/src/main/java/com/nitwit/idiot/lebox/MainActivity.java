package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
        Intent next=new Intent(getApplicationContext(),Bootanim.class);
        startActivity(next);
    }
    public void Bootlogo(View a)
    {
        Intent next=new Intent(getApplicationContext(),Bootlogo.class);
        startActivity(next);
    }
}
