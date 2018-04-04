package com.bear.coding.ex05_20;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.widget.SeekBar.*;


public class MainActivity extends AppCompatActivity {

    SeekBar seek;
    TextView txtValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seek = (SeekBar)findViewById(R.id.SeekBar1);
        txtValue = (TextView)findViewById(R.id.txtValue);


        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.i("My Tag", "onStartTrackingTouch...");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("MyTag", "onProgressChanged..." + "progress");
                txtValue.setText(Integer.toString(progress));
            }


        });
    }
}
