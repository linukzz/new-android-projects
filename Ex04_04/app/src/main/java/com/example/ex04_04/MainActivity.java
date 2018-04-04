package com.example.ex04_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static com.example.ex04_04.R.id.parent;

public class MainActivity extends AppCompatActivity {

    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] data = {"서울","경기도","강원도","충청도","경상도","전라도","제주도"};

        spin = (Spinner)findViewById(R.id.Spinner1);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),
        android.R.layout.simple_spinner_item,data);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(adapter);

        //이벤트처리
        spin.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
                    Log.i("MyTag", data[position] );

                    }
                @Override
                    public void onNothingSelected(AdapterView<?> parent) {


            }
        });
    }
}
