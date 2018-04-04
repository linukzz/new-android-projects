package com.example.ex04_09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MycustomDTO> list =
                new ArrayList<MycustomDTO>();
/*        list.add( new MycustomDTO("캐나다", "캐나다 굿!",R.drawable.canada));
        list.add( new MycustomDTO("프랑스", "프랑스 굿!",R.drawable.france));
        list.add( new MycustomDTO("대한민국", "대한민국 짱!", R.drawable.korea));
        list.add( new MycustomDTO("멕시코", "멕시코 굿!", R.drawable.mexico));
        list.add( new MycustomDTO("폴란드", "폴란드 굿!", R.drawable.poland));
        */
        for (int i =0; i<100; i++){
            list.add( new MycustomDTO("캐나다", "캐나다 굿!",R.drawable.canada));
            list.add( new MycustomDTO("프랑스", "프랑스 굿!",R.drawable.france));
            list.add( new MycustomDTO("대한민국", "대한민국 짱!", R.drawable.korea));
            list.add( new MycustomDTO("멕시코", "멕시코 굿!", R.drawable.mexico));
            list.add( new MycustomDTO("폴란드", "폴란드 굿!", R.drawable.poland));
        }

        listView = (ListView)findViewById(R.id.listView1);

        MycustomAdapter adapter = new MycustomAdapter(getApplicationContext(),
               R.layout.list_row, list);

        listView.setAdapter(adapter);
    }
}
