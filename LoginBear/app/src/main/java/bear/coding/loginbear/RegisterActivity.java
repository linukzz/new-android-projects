package bear.coding.loginbear;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by 이민석 on 2018-02-03.
 */

public class RegisterActivity extends AppCompatActivity {

    private EditText email;
    private EditText pasw1;
    private EditText pasw2;
    private Button accept;
    private Button cancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        email = (EditText)findViewById(R.id.email);
        pasw1 = (EditText)findViewById(R.id.pasw1);
        pasw2 = (EditText)findViewById(R.id.pasw2);
        accept = (Button)findViewById(R.id.accept);
        cancel = (Button)findViewById(R.id.cancel);


        pasw2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String password  = pasw1.getText().toString();
                String comfirm =pasw2.getText().toString();

                if( password.equals(comfirm) ) {
                    pasw1.setBackgroundColor(Color.GREEN);
                    pasw2.setBackgroundColor(Color.GREEN);
                } else
                {
                    pasw1.setBackgroundColor(Color.RED);
                    pasw2.setBackgroundColor(Color.RED);
                }
            }    // 비밀번호 일치 검사

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().length() == 0) {
                    Toast.makeText(RegisterActivity.this, "Input email this!",
                            Toast.LENGTH_SHORT).show();
                    email.requestFocus();
                    return;
                } // 이메일 확인

                if (pasw1.getText().toString().length() == 0) {
                    Toast.makeText(RegisterActivity.this, "Input your Password",
                            Toast.LENGTH_SHORT).show();
                    pasw1.requestFocus();
                    return;
                } // 비밀번호 입력 확인


                if (pasw2.getText().toString().length() == 0) {
                    Toast.makeText(RegisterActivity.this, "Input Password comfirm!",
                            Toast.LENGTH_SHORT).show();
                    pasw2.requestFocus();
                    return;
                } // 비밀번호 확인 입력 확인

                if (pasw2.getText().toString().length() == 0) {
                    Toast.makeText(RegisterActivity.this, "It's not correct password."
                            , Toast.LENGTH_SHORT).show();
                    pasw1.setText("");
                    pasw2.setText("");
                    pasw1.requestFocus();
                    return;
                } // 비밀번호 일치 확인

                Intent result = new Intent();
                result.putExtra("email", email.getText().toString());


                setResult(RESULT_OK, result);
                finish();

                //자신을 호출한 Activity로 데이터 보냄
            }
            });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
