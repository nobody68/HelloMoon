package com.example.training.app.hellomoon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MoonFragment extends Fragment {
    private AudioPlayer mPlayer;
    private Button mPlayButton;
    private Button mStopButton;
    private Button mPauseButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPlayer = new AudioPlayer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hello_moon, parent, false);

        mPlayButton = (Button) view.findViewById(R.id.hello_moon_play_button);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.play(getContext());
            }
        });
        mStopButton = (Button) view.findViewById(R.id.hello_moon_stop_button);
        mStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlayer.stop();
            }
        });
        mPauseButton = (Button) view.findViewById(R.id.hello_moon_pause_button);
        mPauseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPlayer.pause();
            }
        });
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPlayer.stop();
    }
}
