package bear.coding.gwajae15;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static bear.coding.gwajae15.R.id.parent;


public class MainActivity extends AppCompatActivity{

    Spinner spin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String [] data = {"서울", "경기도", "강원도", "충청도", "전라도", "경상도"};

        spin = (Spinner)findViewById(R.id.spin);

        ArrayAdapter adapter = new ArrayAdapter(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,
                data);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(adapter);


        spin.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
                Log.i("My Tag", "data[position]");
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }

        });


    }
}
