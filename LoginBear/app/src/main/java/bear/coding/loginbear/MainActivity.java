package bear.coding.loginbear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.data;


public class MainActivity extends AppCompatActivity {


    private EditText email;
    private Button Register;


    Button Login;
    TextView BearText;
    RelativeLayout Relative;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Relative = (RelativeLayout) findViewById(R.id.Relative);
        Relative.setBackgroundResource(R.drawable.bear);

        Login = (Button) findViewById(R.id.Login);
        BearText = (TextView) findViewById(R.id.BearText);
        email = (EditText) findViewById(R.id.email);
        Register = (Button) findViewById(R.id.Register);


        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);

                //SINGLE_TOP : 이미 만들어진게 있으면 그걸 쓰고, 없으면 만들어서 쓰라.
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

                startActivityForResult(intent, 1000);
            }
        }); // 회원 가입용 버튼 이동 포털만들어줌.
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);




        // setResult를 통해 받아온 요청번호, 상태, 데이터
        Log.d("REESULT", requestCode + "");
        Log.d("RESULT", resultCode + "");
        Log.d("RESULT", data + "");

        if (requestCode == 1000 && resultCode == RESULT_OK) {
            Toast.makeText(MainActivity.this, "Success Register!",
                    Toast.LENGTH_SHORT).show();
            String strEmail = data.getStringExtra("email");
            if (strEmail != null) {

            }
        }


    }

}


