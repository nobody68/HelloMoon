package com.example.training.app.hellomoon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MoonFragment extends Fragment {

    private Button mPlayButton;
    private Button mStopButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hello_moon, parent, false);

        mPlayButton = (Button) view.findViewById(R.id.hello_moon_play_button);
        mStopButton = (Button) view.findViewById(R.id.hello_moon_stop_button);

        return view;
    }
}
