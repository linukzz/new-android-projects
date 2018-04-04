package bear.coding.ex06_10;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    EditText editValue1;
    EditText editValue2;
    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;
    TextView txtResult;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValue1 = (EditText)findViewById(R.id.editValue1);
        editValue2 = (EditText)findViewById(R.id.editValue2);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        txtResult = (TextView)findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int Value1 = Integer.parseInt( editValue1.getText().toString());
        int Value2 = Integer.parseInt( editValue2.getText().toString());

        char op = ((Button)v).getText().charAt(0);

        Intent intent = new Intent(getApplicationContext(), CalcActivity.class);
        intent.putExtra("Value1", Value1);
        intent.putExtra("Value2", Value2);
        intent.putExtra("op", op);
        startActivityForResult(intent, 1); //requestCode는 요청을 식별
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //TODO auto-generated method stub

        super.onActivityResult(requestCode,resultCode, data);

        switch(resultCode) {

            case Activity.RESULT_OK:
                int result = data.getIntExtra("result", 0);
                txtResult.setText("결과값은: " + Integer.toString(result));
                break;

        }

    }
}
