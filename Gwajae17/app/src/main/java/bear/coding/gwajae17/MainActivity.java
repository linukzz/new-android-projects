package bear.coding.gwajae17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView1);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                getApplicationContext(),
                R.array.num,
                android.R.layout.simple_list_item_1);

        listView.setAdapter(adapter);
    }
}
