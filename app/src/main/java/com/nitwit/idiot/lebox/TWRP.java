package com.nitwit.idiot.lebox;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class TWRP extends AppCompatActivity {
    CardView downlaod;
    DownloadManager dm;
    String twrpurl="https://doc-0k-c4-docs.googleusercontent.com/docs/securesc/3er8vbsvilfui60jg6utufjppechuv7p/dmrfc46vui24tmaeamonjkfksrsskdma/1480752000000/01355672019904255492/16240943234981144751/0B1c3qOuqMvK3MGxFWjBNa0tuWjQ?e=download&nonce=rqrcil9dg1joo&user=16240943234981144751&hash=p57f031llgfacf0scoc3dn71rrstqbqr";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twrp);
        downlaod=(CardView)findViewById(R.id.donwloadbutton);
        downlaod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dm=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://drive.google.com/uc?export=download&id=0B1c3qOuqMvK3MGxFWjBNa0tuWjQ");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=dm.enqueue(request);
            }
        });
    }

}
