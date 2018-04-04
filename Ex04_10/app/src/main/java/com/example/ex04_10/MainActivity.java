package com.example.ex04_10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        String [] data = {"사과", "배", "바나나", "귤", "수박", "포도", "토마토", "망고", 
        "참외", "오이"};

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),
                android.R.layout.simple_list_item_1, data);
        
        setListAdapter(adapter);
    }

    public void setListAdapter(ArrayAdapter adapter) {
    }


}
