package com.example.elcha.c9_p23;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Seekbar_Fragment fr1;
    private Yellow_Fragment fr2;
    private static final String SEEKBAR_FRAGMENT = "SEEKBAR_TAG";
    private static final String YELLOW_FRAGMENT = "YELLOW_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fm = getSupportFragmentManager();
        fr1 = (Seekbar_Fragment)fm.findFragmentByTag(SEEKBAR_FRAGMENT);
        fr2 = (Yellow_Fragment)fm.findFragmentByTag(YELLOW_FRAGMENT);
        if (fr1 == null){
            fr1 = new Seekbar_Fragment();
            fm.beginTransaction()
                    .add(R.id.fragment_seekbar, fr1,SEEKBAR_FRAGMENT)
                    .commit();
        }


        if (fr2 == null){
            fr2 = new Yellow_Fragment();
            fm.beginTransaction()
                    .add(R.id.fragment_yellow,fr2,YELLOW_FRAGMENT)
                    .commit();
        }







    }

}
