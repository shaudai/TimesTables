package com.garfieldchou.timestables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar mySeekBar = (SeekBar) findViewById(R.id.mySeekBar);
        mySeekBar.setMax(20);
        mySeekBar.setProgress(10);

        mySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int min = 1;
                int timesTable;

                if (i < min) {
                    timesTable = min;
                    mySeekBar.setProgress(min);
                } else {
                    timesTable = i;
                }
                Log.i("base", Integer.toString(timesTable));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

}
