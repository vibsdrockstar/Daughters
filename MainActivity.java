package com.example.vibhor.playvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {
    Button clk;
    VideoView videov;
    MediaController mediav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clk = (Button) findViewById(R.id.b_play);
        videov = (VideoView) findViewById(R.id.videoView);
    }
    public void videoplay(View v)
    {
        String videopath ="android.resource://com.example.vibhor.playvideo/"+R.raw.daughters;
        Uri vid = Uri.parse(videopath);
        videov.setVideoURI(vid);
        videov.setMediaController(mediav);
        mediav.setAnchorView(videov);
        videov.start();

    }
}


