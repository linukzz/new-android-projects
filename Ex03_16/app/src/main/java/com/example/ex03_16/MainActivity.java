package com.example.ex03_16;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                try {

                    final ImageView imgGoogle =
                            (ImageView) findViewById(R.id.imgGoogle);

                    URL url = new URL("http://cfile217.uf.daum.net/image/224E575052203C1F32567E");
                    InputStream is = url.openStream();
                    final Bitmap bm = BitmapFactory.decodeStream(is);

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            imgGoogle.setImageBitmap(bm);
                        }
                    });
                    is.close();
                }catch(Exception e){e.printStackTrace();}


            }
        });
        t.start();
    }
}
