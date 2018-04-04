package bear.coding.gwajae5;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ImageView kor = (ImageView)findViewById(R.id.kor);
        kor.setImageResource(R.mipmap.ic_launcher);

        ImageView cnd = (ImageView)findViewById(R.id.cnd);
            cnd.setImageResource(R.mipmap.ic_launcher);

        ImageView mex = (ImageView)findViewById(R.id.mex);
            mex.setImageResource(R.mipmap.ic_launcher);
    }
}
