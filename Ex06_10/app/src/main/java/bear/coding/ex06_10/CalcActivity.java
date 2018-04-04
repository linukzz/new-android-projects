package bear.coding.ex06_10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by 이민석 on 2018-01-30.
 */

public class CalcActivity extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        int Value1 = intent.getIntExtra("Value1" ,0);
        int Value2 = intent.getIntExtra("Value2", 0);
        char op = intent.getCharExtra("op", '+');

        int result = 0;

        switch(op) {

            case '+':
                result = Value1 + Value2;
                break;

            case '-':
                result = Value1 - Value2;
                break;

            case 'x':
                result = Value1 * Value2;
                break;

            case '/':
                result = Value1 / Value2;
                break;
        }


        intent.putExtra("result", result);
        setResult(Activity.RESULT_OK, intent);

        finish();

        }

    }
