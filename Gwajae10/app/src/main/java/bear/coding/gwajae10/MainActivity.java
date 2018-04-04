package bear.coding.gwajae10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Switch switch1;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = (Switch)findViewById(R.id.switch1);
        txt = (TextView)findViewById(R.id.txt);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if( isChecked) {  // isChecked하면 켜진 상태를 말한다.
                    txt.setText("ON");
                } else {
                    txt.setText("OFF");
                 }
            }
        });


    }
}
