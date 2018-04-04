package com.bear.coding.ex06_01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by 이민석 on 2018-01-28.
 */

public class NextActivity extends Activity {


    Button btnNext1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.next);  // xml 지정

        btnNext1 = findViewById(R.id.btnNext1);
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //이전 액티비티로 돌아가기
                finish();
            }
        });
    }
}
