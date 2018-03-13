package com.example.elcha.c9_p23;

import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

public class seekbar_fragment extends Fragment implements SeekBar.OnSeekBarChangeListener {

    private SeekBar sbdim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("Testing", "Inflating yellow fragment");

        View fragmentView = inflater.inflate(R.layout.seekbar_fragment, container, false);

        sbdim = fragmentView.findViewById(R.id.sbdim);
        sbdim.setProgress(50);
        sbdim.setOnSeekBarChangeListener(this);
        return fragmentView;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        MainActivity act = (MainActivity) getActivity();
        act.seekColor((float) i / 100);

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStart() {
        Log.e("Testing", "Starting seekbar fragment");
        super.onStart();

    }


}
