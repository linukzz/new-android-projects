package com.example.imageapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.
        ImageView imgCanada =
                (ImageView)findViewById(R.id.imgCanada);
        imgCanada.setImageResource(R.drawable.canada);

        //2.
        ImageView imgKorea =
                (ImageView)findViewById(R.id.imgKorea);
                Drawable drawable =
                        getResources().getDrawable(R.drawable.korea);
        imgKorea.setImageDrawable(drawable);

        //3.
        ImageView imgMexico =
                (ImageView)findViewById(R.id.imgMexico);
        Bitmap bm =
                BitmapFactory.decodeResource(getResources(),R.drawable.mexico);
        imgMexico.setImageBitmap(bm);
    }
}
