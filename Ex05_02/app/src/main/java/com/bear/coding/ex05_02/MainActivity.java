package com.bear.coding.ex05_02;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnToast = (Button)findViewById(R.id.btnToast);
        btnToast.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                LayoutInflater inf =
                        (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View convertView = inf.inflate(R.layout.custom, null);

                Toast t = Toast.makeText(getApplicationContext(),
                        "출력메시지", Toast.LENGTH_SHORT);

                t.setView(convertView);

                t.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                t.show();
            }
        });
    }
}
