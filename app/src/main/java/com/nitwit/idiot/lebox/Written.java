package com.nitwit.idiot.lebox;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Written extends AppCompatActivity {
    TextView t1,t2;
    TextToSpeech tts;
    int result;
    CardView card;
    CardView card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_written);
        tts=new TextToSpeech(Written.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i==TextToSpeech.SUCCESS){
                    result=tts.setLanguage(Locale.US);
                }else{
                    Toast.makeText(getApplicationContext(),"not supported",Toast.LENGTH_SHORT).show();
                }

            }
        });

        card=(CardView)findViewById(R.id.card_view1);
        card2=(CardView)findViewById(R.id.card_view2);
        card.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                tts.speak("First Bootloader needs to be unlocked",TextToSpeech.QUEUE_FLUSH,null);
                return false;
            }
        });
        card2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                tts.speak("Bootloop and Blinking solution",TextToSpeech.QUEUE_FLUSH,null);
                return false;
            }
        });
        t1=(TextView)findViewById(R.id.text1);
        t2=(TextView)findViewById(R.id.text2);
        t1.setText("First Bootloader needs to be unlocked\n" +
                "\n" +
                "\n" +
                "Procedure\n" +
                "\n" +
                "Download Rar file :-https://drive.google.com/file/d/0B5KBP3GG99Q2a1BfbVZUaUh4U28/view\n" +
                "\n" +
                "Unlock Bootloader first\n" +
                "\n" +
                "\n" +
                "Go to mobile settings >> About Phone >> tap Version 7 Times and hit back\n" +
                "\n" +
                "\n" +
                "U will have a new option just above the About Phone option called Developer Options open it and select USB Debugging\n" +
                "\n" +
                "Connect the mobile with pc through USB cable\n" +
                "\n" +
                "Download and Install drivers\n" +
                "http://pdanet.co/a/\n" +
                "\n" +
                "\n" +
                "Extract naeem210.rar and open extracted folder\n" +
                "\n" +
                "  Extract adb rar\n" +
                "\n" +
                "Keep pressing shift key and right click and select open command window\n" +
                "\n" +
                "Type adb reboot bootloader\n" +
                "After it Reboots\n" +
                "Type fastboot oem unlock\n" +
                "press valume up confirm\n" +
                "\n" +
                "NOW THE BOOTLOADER IS UNLOCKED\n" +
                "\n" +
                "Completely switch off the mobile press 10 second power key\n" +
                "open SP tool\n" +
                "Select Scatter file and select only USERDATA\n" +
                "Untick recovery img\n" +
                "open dowonload agent and select DA_PL.bin\n" +
                "Select Download option and hit start\n" +
                "then connect ur mobile valume down key via usb cable and wait for the process to finish\n" +
                "Dont power on mobile\n" +
                "\n" +
                "How to install twrp\n" +
                "\n" +
                "open SP tool\n" +
                "Select Scatter file and select only Recovery IMG\n" +
                "UNTICK USERDATA\n" +
                "open dowonload agent and select DA_PL.bin\n" +
                "Select Download option and hit start\n" +
                "then connect ur mobile valume down key via usb cable and wait for the process to finish\n" +
                "\n" +
                "remove usb cable\n" +
                "power on mobile\n" +
                "enjoy.......\n" +
                "\n" +
                "How To root\n" +
                "\n" +
                "\n" +
                "Start the mobile Dowonlod and copy the Superuser.zip file to memory\n" +
                "https://download.chainfire.eu/897/SuperSU/BETA-SuperSU-v2.67-20160121175247.zip\n" +
                "Go to updater app and select reboot to recovery\n" +
                "\n" +
                "Install superuser.zip\n" +
                "\n" +
                "Enjoy................................"
                +
                "\n"
                +
                "\n"
                +
                "\n");
        t2.setText("" +
                "" +
                "Bootloop and Blinking solution\n" +
                "\n" +
                "Completely switch off the mobile press 10 second power key\n" +
                "\n" +
                "open sp tool select scatter select only userdata untick recovery.img\n" +
                "open dowonload agent and select DA_PL.bin\n" +
                "and Select Download option  and hit start\n" +
                "then connect ur mobile presing valume down key   and wait for the process to finish\n" +
                "\n" +
                "\n" +
                "\n" +
                ".............................ENJOY.......................\n");

    }
}
