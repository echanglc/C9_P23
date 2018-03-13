package com.example.elcha.c9_p23;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class yellow_fragment extends Fragment {

    private FrameLayout frag_yellow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("Testing", "Inflating yellow fragment");
        // Inflate the layout for this fragment

        View fragmentView = inflater.inflate(R.layout.yellow_fragment, container, false);
        frag_yellow = fragmentView.findViewById(R.id.frag_yellow);

        return fragmentView;
    }

    @Override
    public void onStart() {
        Log.e("Testing", "Starting yellow fragment");
        super.onStart();

    }

    public void setColor(int opacity) {
        frag_yellow.setBackgroundColor(opacity);
    }
}
