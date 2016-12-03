package com.nitwit.idiot.lebox;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        video=(VideoView)findViewById(R.id.videoView);
        MediaController media=new MediaController(this);
        media.setAnchorView(video);
        Uri uri=Uri.parse("https://www.youtube.com/watch?v=chvki68McG0");
        video.setMediaController(media);
        video.setVideoURI(uri);
        video.requestFocus();
        video.start();
    }
}
