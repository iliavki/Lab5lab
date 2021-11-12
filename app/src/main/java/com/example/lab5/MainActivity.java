package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView MyvideoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyvideoPlayer = (VideoView)findViewById(R.id.videView);
        Uri myVideoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vanyadaidudku);
        MyvideoPlayer.setVideoURI(myVideoUri);
        MediaController mediaController = new MediaController(this);
        MyvideoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(MyvideoPlayer);
        Button start = findViewById(R.id.start);
        Button pause = findViewById(R.id.pause);
        Button resume = findViewById(R.id.resume);
    }

    public void onStartClick(View view){
        MyvideoPlayer.start();
    }

    public void onPauseClick(View view){
        MyvideoPlayer.pause();
    }

    public void onResumeClick (View view) {
        MyvideoPlayer.stopPlayback();
        MyvideoPlayer.resume();
    }

}