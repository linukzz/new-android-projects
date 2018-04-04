package bear.coding.storefoodcalories;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 이민석 on 2018-03-10.
 */

public class explain extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explain);

        ImageView img;
        TextView txt;
        TextView txt2;


        img= (ImageView)findViewById(R.id.img);
        txt= (TextView)findViewById(R.id.txt);
        txt2= (TextView)findViewById(R.id.txt2);

        Button btn1 = (Button)findViewById(R.id.btn1);

        Intent intent = getIntent();
        img.setImageResource(intent.getIntExtra("img",0));
        txt.setText(intent.getStringExtra("text"));
        txt2.setText(intent.getStringExtra("calories"));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}
