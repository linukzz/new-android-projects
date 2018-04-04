package bear.coding.ex06_09;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

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

        Bundle bundle = intent.getBundleExtra("bundle");

        String name = bundle.getString("name");
        int Age = bundle.getInt("Age");
        String Address = bundle.getString("Address");

        String mesg = "이름은: " + name + "나이는 : " + Age + "주소는 : " + Address;
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
