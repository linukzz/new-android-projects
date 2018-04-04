package com.bear.coding.ex04_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    boolean isLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override

    public boolean onPrepareOptionsMenu(Menu menu) {

        if(isLogin){
            menu.getItem(5).setTitle("Logout");
            isLogin = false;
        } else {
            menu.getItem(5).setTitle("Login");
            isLogin = true;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch( item.getItemId() ) {

            case R.id.item01:
                Log.i("My Tag", "item01");
                break;
            case R.id.item02:
                Log.i("My Tag", "item02");
                break;
            case R.id.item03:
                Log.i("My Tag", "item03");
                break;
            case R.id.item04:
                Log.i("My Tag", "item04");
                break;
            case R.id.item05:
                Log.i("My Tag", "item05");
                break;
            case R.id.item06:
                Log.i("My Tag", "item06");
                break;

        }
        return true;
    }
}
