package bear.coding.ex06_08;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



/**
 * Created by 이민석 on 2018-01-29.
 */

public class NextActivity extends Activity {

    TextView txtResult;
    Button btnBack;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);

        txtResult = (TextView)findViewById(R.id.txtResult);

        Intent intent = getIntent();   //인텐트 얻기

        Person p = (Person)intent.getSerializableExtra("person"); // 직렬화 객체 얻기

        String name = p.getName();
        int age = p.getAge();
        String address = p.getAddress();

        String mesg = "name : " + name + "Age : " + age + "Address : " + address;
        txtResult.setText(mesg);

        btnBack = (Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
