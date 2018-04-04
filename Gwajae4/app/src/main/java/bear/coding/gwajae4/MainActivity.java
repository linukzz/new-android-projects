package bear.coding.gwajae4;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    RadioGroup Sex;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result = (TextView)findViewById(R.id.Result);
        Sex = (RadioGroup)findViewById(R.id.RadioGroup1);
        Sex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup Sex, int checkedId) {

                switch( checkedId) {
                    case R.id.blowjob :
                       Result.setText("blow job is best!");
                        break;
                    case R.id.footjob :
                        Result.setText("Foot job is best!");
                        break;
                    case R.id.handjob :
                       Result.setText("Hand job is best!");
                        break;
                }
            }
        });

    }
}
