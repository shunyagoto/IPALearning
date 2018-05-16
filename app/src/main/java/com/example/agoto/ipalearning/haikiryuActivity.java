package com.example.agoto.ipalearning;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class haikiryuActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haikiryu);
    }

    public void onPButtonTapped(View view) {
        flag = true;
        mMediaPlayer = MediaPlayer.create(this, R.raw.p);
        voicestart(mMediaPlayer);
    }

    public void voicestart(MediaPlayer mMediaPlayer) {
        this.mMediaPlayer.setLooping(false);
        this.mMediaPlayer.start();
        while (flag) {
            if (this.mMediaPlayer.isPlaying()) {
                flag = true;
            } else {
                this.mMediaPlayer.stop();
                this.mMediaPlayer.reset();
                this.mMediaPlayer.release();
                flag = false;
            }
        }
    }
}//
