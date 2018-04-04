package bear.coding.gwajae11;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {

    Button btnKorea;
    Button btnMexico;
    Button btnCanada;
    Button btnFrance;

    ImageView imgKorea;
    ImageView imgMexico;
    ImageView imgCanada;
    ImageView imgFrance;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKorea = (Button) findViewById(R.id.btnKorea);
        btnCanada = (Button)findViewById(R.id.btnCanada);
        btnMexico = (Button)findViewById(R.id.btnMexico);
        btnFrance = (Button)findViewById(R.id.btnFrance);

        imgKorea = (ImageView)findViewById(R.id.imgKorea);
        imgCanada = (ImageView)findViewById(R.id.imgCanada);
        imgMexico = (ImageView)findViewById(R.id.imgMexico);
        imgFrance = (ImageView)findViewById(R.id.imgFrance);


        btnKorea.setOnClickListener(this);
        btnCanada.setOnClickListener(this);
        btnMexico.setOnClickListener(this);
        btnFrance.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnKorea:
                imgKorea.setVisibility(View.VISIBLE);
                imgCanada.setVisibility(View.INVISIBLE);
                imgFrance.setVisibility(View.INVISIBLE);
                imgMexico.setVisibility(View.INVISIBLE);
                break;


            case R.id.btnCanada :
                imgKorea.setVisibility(View.INVISIBLE);
                imgCanada.setVisibility(View.VISIBLE);
                imgFrance.setVisibility(View.INVISIBLE);
                imgMexico.setVisibility(View.INVISIBLE);
                break;


            case R.id.btnMexico:
                imgKorea.setVisibility(View.INVISIBLE);
                imgCanada.setVisibility(View.INVISIBLE);
                imgFrance.setVisibility(View.INVISIBLE);
                imgMexico.setVisibility(View.VISIBLE);
                break;


            case R.id.btnFrance:
                imgKorea.setVisibility(View.INVISIBLE);
                imgCanada.setVisibility(View.INVISIBLE);
                imgFrance.setVisibility(View.VISIBLE);
                imgMexico.setVisibility(View.INVISIBLE);
                break;


        }
    }
}