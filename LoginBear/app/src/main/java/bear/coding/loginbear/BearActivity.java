package bear.coding.loginbear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 이민석 on 2018-02-03.
 */




public class BearActivity extends Activity {


    TextView Beartxt;
    Button Back;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bear);

        Beartxt = (TextView)findViewById(R.id.Beartxt);

        Intent intent = getIntent();

        Bundle bundle = intent.getBundleExtra("bundle");

        String ID = intent.getStringExtra("ID");
        String Pass =  intent.getStringExtra("PASS");

        String name = "ID :" + ID + "PASS :" + Pass;
        Beartxt.setText(name);

        Back = (Button)findViewById(R.id.Back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
