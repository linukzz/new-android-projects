package bear.coding.gwajae14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] data = {"서울", "경기도", "강원도", "경상도", "충청도", "전라도", "제주도"};

        spin = (Spinner)findViewById(R.id.Spin);

        ArrayAdapter adapter =
                new ArrayAdapter(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        data);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
    }
}
