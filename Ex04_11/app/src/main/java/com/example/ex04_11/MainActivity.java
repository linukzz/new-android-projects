package com.example.ex04_11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import static com.example.ex04_11.R.*;
import static com.example.ex04_11.R.drawable.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);


        ArrayList<MyCustomDTO> list = new ArrayList<MyCustomDTO>();


        list.add(new MyCustomDTO("canada", R.drawable.canada));
        list.add(new MyCustomDTO("canada", R.drawable.canada));
        list.add(new MyCustomDTO("canada", R.drawable.canada));
        list.add(new MyCustomDTO("korea", R.drawable.korea));
        list.add(new MyCustomDTO("korea", R.drawable.korea));
        list.add(new MyCustomDTO("korea", R.drawable.korea));
        list.add(new MyCustomDTO("france", R.drawable.france));
        list.add(new MyCustomDTO("france", R.drawable.france));
        list.add(new MyCustomDTO("france", R.drawable.france));
        list.add(new MyCustomDTO("mexico", R.drawable.mexico));
        list.add(new MyCustomDTO("mexico", R.drawable.mexico));
        list.add(new MyCustomDTO("mexico", R.drawable.mexico));
        list.add(new MyCustomDTO("poland", R.drawable.poland));
        list.add(new MyCustomDTO("poland", R.drawable.poland));
        list.add(new MyCustomDTO("poland", R.drawable.poland));

        GridView grid = (GridView) findViewById(id.gridView1);

        MyCustomAdapter Adapter = new MyCustomAdapter(getApplicationContext(),
                layout.gridview, list);

        grid.setAdapter(Adapter);
    }
}