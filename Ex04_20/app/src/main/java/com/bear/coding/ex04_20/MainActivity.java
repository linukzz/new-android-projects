package com.bear.coding.ex04_20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnContext = (Button)findViewById(R.id.Button1);

        registerForContextMenu(btnContext);  // 위젯을 컨텍스트 메뉴로 지정함.
    }

    // 15~22 줄까진 버튼 속성의 변수를 생성해서 id로 activity_main과 연결해주고,
    //registerForContextMenu라는 함수로 그 변수를 컨텍스트 메뉴로 지정.
    //(패딩에다가 가격표 달아놓은 느낌)


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
    }

    //29~35 줄까지는 오버라이딩을 해서 메뉴를 만들어준다.(한번 써서 재사용할 메뉴 선언)




    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch( item.getItemId()) {
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

// 42~66줄은 switch에서 아이템들이 아이디를 통해 연결할 수 있게 하는 설정을 먼저하고,
// case문 으로 각 아이템마다 태그를 걸어서 break;으로 강종을 시켜서 깔끔하게 코딩하게 만듬.
// 나갈 때는 값이 true로 나갈 수 있도록 설정한다.
