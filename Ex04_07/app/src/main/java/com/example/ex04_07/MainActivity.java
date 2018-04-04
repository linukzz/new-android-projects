package com.example.ex04_07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] data = {"사과", "배", "바나나", "귤", "수박", "포도", "토마토", "망고",
        "참외", "오이"};

        listView = (ListView)findViewById(R.id.ListView1);

        ArrayAdapter adapter = new ArrayAdapter(
                getApplicationContext(), android.R.layout.simple_list_item_1, data);

        listView.setAdapter(adapter);

        }
    }
