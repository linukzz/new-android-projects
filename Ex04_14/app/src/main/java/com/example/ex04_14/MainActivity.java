package com.example.ex04_14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater Inflater = getMenuInflater();
        Inflater.inflate(R.menu..mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemselected(MenuItem item) {

        switch( item.getItemId() ) {
            case R.id.item1:
                Log.i("My Tag", "item1");
                break;
            case R.id.item2:
                Log.i("My Tag", "item2");
                break;
            case R.id.item3:
                Log.i("My Tag", "item3");
                break;
            case R.id.item4:
                Log.i("My Tag", "item4");
                break;
            case R.id.item5:
                Log.i("My Tag", "item5");
                break;
            case R.id.item6:
                Log.i("My Tag", "item6");
        }
        return true;
    }
}
