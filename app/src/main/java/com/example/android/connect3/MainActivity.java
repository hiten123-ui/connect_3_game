package com.example.android.connect3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int activePlayer = 0;
    // 0 yellow, 1 red
    public void dropin(View view)
    {
        ImageView counter = (ImageView) view;

        counter.setTranslationY(-1500);
        Log.i("Tag", counter.getTag().toString());
        if (activePlayer == 0) {
            counter.setImageResource(R.drawable.yellow);

            counter.animate().rotationBy(3600).translationYBy(1500);

            activePlayer = 1;
        }
        else{
            counter.setImageResource(R.drawable.red);

            counter.animate().rotationBy(3600).translationYBy(1500);

            activePlayer = 0;

        }
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
//this is a comment