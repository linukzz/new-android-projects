package bear.coding.ex07_01;

import android.content.Context;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import static android.content.Context.INPUT_METHOD_SERVICE;


public class MainActivity extends AppCompatActivity {

    EditText editInput;
    Button btnSave;
    Button btnShow;
    TextView txtResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInput = (EditText)findViewById(R.id.editInput);
        btnSave = (Button)findViewById(R.id.btnSave);
        btnShow = (Button)findViewById(R.id.btnShow);
        txtResult = (TextView)findViewById(R.id.txtResult);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editInput.getText().toString();

                try{
                    FileOutputStream fos =
                            openFileOutput("internal.txt", Context.MODE_APPEND);

                    PrintWriter out = new PrintWriter(fos);
                    out.println(data);
                    out.close();
                } catch(Exception e) { e.printStackTrace();}


                //가상 키보드 제거
                InputMethodManager imm =
                        (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            }
        });

        //파일 읽기

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try{

                    StringBuffer data = new StringBuffer();

                    FileInputStream fis = openFileInput("internal.txt");

                    BufferedReader buffer =
                            new BufferedReader(new InputStreamReader(fis));
                    String str = buffer.readLine();
                    while(str != null) {
                        data.append(str+"/n");
                        str = buffer.readLine();
                    }
                    txtResult.setText(data.toString() + "\n");
                    buffer.close();
                } catch(Exception e) { e.printStackTrace();}

            }
        });




    }
}
