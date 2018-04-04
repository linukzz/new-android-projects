package com.bear.coding.ex04_21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.PopupMenu;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPopup = (Button)findViewById(R.id.Button1);
        btnPopup.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //팝업메뉴생성
                PopupMenu popup = new PopupMenu(MainActivity.this, v);

                //이벤트처리
                popup.setOnMenuItemClickListener(MainActivity.this);

                //메뉴아이템설정
                MenuInflater inflater = popup.getMenuInflater();
                inflater.inflate(R.menu.mymenu, popup.getMenu());
                popup.show();
            }

        });
    }


        @Override
        public boolean onMenuItemClick(MenuItem item) {
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
        }
        return true;
    }
}
