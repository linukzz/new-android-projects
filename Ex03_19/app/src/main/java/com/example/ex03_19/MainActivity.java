package com.example.ex03_19;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnKorea;
    Button btnCanada;
    Button btnMexico;
    Button btnFrance;

    ImageView imgKorea;
    ImageView imgCanada;
    ImageView imgMexico;
    ImageView imgFrance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKorea = (Button)findViewById(R.id.btnKorea);
        btnCanada = (Button)findViewById(R.id.btnCanada);
        btnMexico = (Button)findViewById(R.id.btnMexico);
        btnFrance = (Button)findViewById(R.id.btnFrance);

        imgKorea = (ImageView)findViewById(R.id.imgKorea);
        imgCanada = (ImageView)findViewById(R.id.imgCanada);
        imgMexico = (ImageView)findViewById(R.id.imgMexico);
        imgFrance = (ImageView)findViewById(R.id.imgFrance);

        btnKorea.setOnClickListener(this);
        btnCanada.setOnClickListener(this);
        btnMexico.setOnClickListener(this);
        btnFrance.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        switch ( v.getId()) {

            case R.id.btnKorea:
                imgKorea.setVisibility(View.VISIBLE);
                imgCanada.setVisibility(View.INVISIBLE);
                imgMexico.setVisibility(View.INVISIBLE);
                imgFrance.setVisibility(View.INVISIBLE);
                break;

            case R.id.btnCanada:
                imgKorea.setVisibility(View.INVISIBLE);
                imgCanada.setVisibility(View.VISIBLE);
                imgMexico.setVisibility(View.INVISIBLE);
                imgFrance.setVisibility(View.INVISIBLE);
                break;

            case R.id.btnMexico:
                imgKorea.setVisibility(View.INVISIBLE);
                imgCanada.setVisibility(View.INVISIBLE);
                imgMexico.setVisibility(View.VISIBLE);
                imgFrance.setVisibility(View.INVISIBLE);
                break;

            case R.id.btnFrance:
                imgKorea.setVisibility(View.INVISIBLE);
                imgCanada.setVisibility(View.INVISIBLE);
                imgMexico.setVisibility(View.INVISIBLE);
                imgFrance.setVisibility(View.VISIBLE);
                break;

        }

    }
}
