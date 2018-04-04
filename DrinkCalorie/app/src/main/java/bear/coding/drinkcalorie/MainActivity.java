package bear.coding.drinkcalorie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ListView listView;
    adapter adapter;
    ArrayList<listview> list = new ArrayList<listview>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list = new ArrayList<listview>();
        list.add(new listview(R.drawable.cheeze, "치즈 브레드"));
        list.add(new listview(R.drawable.masita, "마시따"));
        list.add(new listview(R.drawable.holic, "피자 홀릭"));

        listView = (ListView)findViewById(R.id.ListView1);

        Adapter adapter = new adapter(getApplicationContext(), R.layout.list_row, list );

        listView.setAdapter(adapter);





     // 리스트를 관리하는 액티비티

    }

    @Override
    public void onClick(View v) {

    }
}
