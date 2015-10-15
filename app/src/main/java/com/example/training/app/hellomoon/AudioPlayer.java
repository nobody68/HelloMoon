package com.example.training.app.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

import java.io.IOException;

/**
 * Created by Micah on 10/15/2015.
 */
public class AudioPlayer {

    private MediaPlayer mMediaPlayer = null;

    public void stop(){
        if(mMediaPlayer != null){
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    public void play(Context context){
        stop();
        mMediaPlayer = MediaPlayer.create(context, R.raw.one_small_step);
        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {


            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();
    }
}
