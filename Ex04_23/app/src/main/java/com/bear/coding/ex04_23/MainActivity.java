package com.bear.coding.ex04_23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        @Override
                public boolean onCreateOptionsMenu(Menu menu) {

            MenuInflater inf = getMenuInflater();
            inf.inflate(R.menu.mymenu, menu);
            return super.onCreateOptionsMenu(menu);
        }

        @Override
                public boolean onOptionsItemSelected(MenuItem item) {

            String mesg = null;
            switch(item.getItemId()) {
                case R.id.itemTel:
                    mesg = "Tel 선택";
                    break;
                case R.id.itemChat:
                    mesg = "Chat 선택";
                    break;
                case R.id.itemEmail:
                    mesg = "Email 선택";
                    break;

            }

            Toast.makeText(getApplicationContext(), mesg, Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);

        }

}
