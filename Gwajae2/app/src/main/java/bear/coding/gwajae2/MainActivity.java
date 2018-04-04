package bear.coding.gwajae2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;


public class MainActivity extends Activity implements OnCheckedChangeListener {

    CheckBox chkA;
    CheckBox chkB;
    CheckBox chkC;
    TextView txtResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkA = (CheckBox)findViewById(R.id.chkA);
        chkB = (CheckBox)findViewById(R.id.chkB);
        chkC = (CheckBox)findViewById(R.id.chkC);
        txtResult = (TextView)findViewById(R.id.txtResult);

        chkA.setOnCheckedChangeListener( this );
        chkB.setOnCheckedChangeListener( this );
        chkC.setOnCheckedChangeListener( this );

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String str = "checkVaule is";

        if(chkA.isChecked()) {
            str += chkA.getText().toString();
        }

        if(chkB.isChecked()) {

            str += chkB.getText().toString();
        }

        if(chkC.isChecked()) {
            str += chkC.getText().toString();
        }

        txtResult.setText(str);
    }
}
