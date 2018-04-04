package bear.coding.ex07_02;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean mExternalStorageAvailable = false;
        boolean mExternalStorageWriteable = false;

        String state = Environment.getExternalStorageState();
        String name = Environment.getExternalStorageDirectory().getAbsolutePath();

        if( Environment.MEDIA_MOUNTED.equals(state) )   {
            mExternalStorageAvailable = true;
            mExternalStorageWriteable = false;
            Log.i("My Tag", "MEDIA_MOUNTED");

        } else {
            //SdCad 사용 불가
            mExternalStorageAvailable = mExternalStorageWriteable = false;
            Log.i("My Tag", "NOMOUNTED");
        }


    }
}
