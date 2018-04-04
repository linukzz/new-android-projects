package bear.coding.ex06_07;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 10);
        String address = intent.getStringExtra("Address");

        String mesg = "name :" + name + "age:" + age + "address:" + address;
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
