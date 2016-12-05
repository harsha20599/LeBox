package com.nitwit.idiot.lebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Info extends AppCompatActivity {
    TextView texthead,textcontent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent next=getIntent();
        int num=next.getIntExtra("key",0);
        texthead=(TextView)findViewById(R.id.text_head);
        textcontent=(TextView)findViewById(R.id.text_content);
        if(num==1)
        {
            texthead.setText("What is ROM?");
            textcontent.setText("You may have heard of people loading custom" +
                    " “ROMs” on their Android devices. A “ROM” is the operating" +
                    " system software that runs your Droid. It is stored in the " +
                    "“Read Only Memory” portion of the hardware on the Android" +
                    " smartphone and/or tablet. All Android devices come with a " +
                    "stock ROM installed by the manufacturer. But, if you root your" +
                    " device, you gain the ability to install custom ROMs that will" +
                    " completely change the look and feel of the software. This is" +
                    " one of the major reasons that people choose to root their Droids.");
        }
        if(num==2)
        {
            texthead.setText("What is Recovery?");
            textcontent.setText("Recovery, in Android, refers to the bootable partition," +
                    " in which the recovery console is installed. It contains tools to help" +
                    " repair your installations as well as install official OS updates by" +
                    " using a combination of key presses or instructions from a command" +
                    " line sometimes.  Android is open, meaning the recovery source code " +
                    "is available, so that building a customized ROM is relatively easy. " +
                    "Most Android devices are defaulted with a fairly simple recovery mode " +
                    "that can be used to fastboot the device, recover, wipe data and find" +
                    " other info about your device. Just like a lot of other things with Android," +
                    " even the Recovery Mode can be customized to do more things.");
        }
        if(num==3)
        {
            texthead.setText("What are Gapps?");
            textcontent.setText("It means \"Google Applications\" and usually includes Play" +
                    " Store, Gmail, Google Calender, and more. If you have some of these " +
                    "applications, then you already have some GAPPS.\n" +
                    "Most users will only need to install GAPPS if they have installed a" +
                    " custom ROM that did not have GAPPS included.");
        }

        if(num==4)
        {
            texthead.setText("What is Bootanimation?");
            textcontent.setText(" A boot animation is the animation that is played when" +
                    " your device starts up. Root access is required and your device must be" +
                    " compatible to install custom boot animations.");
        }
        if(num==5)
        {
            texthead.setText("What is Bootlogo?");
            textcontent.setText(" A bootlogo is the logo that is displayed in starting when" +
                    " your device boots up. Root access is required and your device must be" +
                    " compatible to install custom bootlogos.");
        }
    }
}
