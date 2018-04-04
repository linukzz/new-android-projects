package com.example.ex04_08;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import static android.widget.AdapterView.*;
import static com.example.ex04_08.R.id.parent;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.ListView1);

        final String[] data
                = {"사과", "배", "바나나", "귤", "수박", "포도", "토마토",
                "망고", "참외", "오이"};

        ArrayAdapter adapter =
                new ArrayAdapter(getApplicationContext(),
                        android.R.layout.simple_list_item_1, data);

        listView.setAdapter(adapter);

        //이벤트처리

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(
                    AdapterView<?> parent, View v, int position, long id) {

                // Log.i("MyTag", data[position]);
                TextView txtView = (TextView)v;
                Log.i("MyTag", txtView.getText().toString() );
            }
       });
    }
}
