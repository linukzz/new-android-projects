package com.bear.coding.ex05_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnToast = (Button)findViewById(R.id.btnToast);
        btnToast.setOnClickListener( new View.OnClickListener()  {

            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "출력 메시지",
                        Toast.LENGTH_LONG).show();
            }

        });
    }
}
