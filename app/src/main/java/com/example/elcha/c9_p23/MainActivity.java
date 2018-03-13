package com.example.elcha.c9_p23;
import android.app.FragmentManager;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();

        if (fm.findFragmentById(R.id.seekbar_fragment) == null && fm.findFragmentById(R.id.yellow_fragment) == null) {
            FragmentTransaction trans = fm.beginTransaction();
            seekbar_fragment fr1 = new seekbar_fragment();
            yellow_fragment fr2 = new yellow_fragment();
            trans.add(R.id.seekbar_fragment, fr1);
            trans.add(R.id.yellow_fragment, fr2);
            trans.commit();
        }
    }
    public void seekColor(float color) {
        yellow_fragment fr2 = (yellow_fragment) getFragmentManager().findFragmentById(R.id.yellow_fragment);
        int alpha = Math.round(Color.alpha(Color.YELLOW) * color);
        int r = Color.red(Color.YELLOW);
        int g = Color.green(Color.YELLOW);
        int b = Color.blue(Color.YELLOW);
        int newColor = Color.argb(alpha, r, g, b);
        fr2.setColor(newColor);
    }
}