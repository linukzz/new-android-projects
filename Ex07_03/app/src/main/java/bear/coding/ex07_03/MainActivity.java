package bear.coding.ex07_03;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

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

                    //picture 폴더에 파일 저장

                    File path = Environment.getExternalStoragePublicDirectory
                            (Environment.DIRECTORY_PICTURES);

                    File f = new File(path, "external.txt");

                    FileWriter writer = new FileWriter(f, true);
                    PrintWriter out = new PrintWriter(writer );
                    out.println(data);
                    out.close();

                }catch (Exception e) { e.printStackTrace();}


                InputMethodManager imm = (InputMethodManager)getSystemService
                        (INPUT_METHOD_SERVICE);

                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

            }
        });


        //파일 읽기

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    StringBuffer data = new StringBuffer();

                    File path =
                            Environment.getExternalStoragePublicDirectory(
                                    Environment.DIRECTORY_PICTURES);

                    File f = new File(path, "external.txt");

                    BufferedReader buffer =
                            new BufferedReader( new FileReader(f));
                    String str = buffer.readLine();
                    while( str != null) {

                        data.append(str + "\n");
                        str = buffer.readLine();



                    }

                    txtResult.setText(data);
                    buffer.close();


                }catch (Exception e) { e.printStackTrace();}
            }
        });
    }
}
