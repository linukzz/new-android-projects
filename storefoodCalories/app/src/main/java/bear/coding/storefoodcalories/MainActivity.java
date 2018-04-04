package bear.coding.storefoodcalories;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;


public class MainActivity extends Activity  {

    ListView listView;
    ImageView img;
    TextView txt;
    TextView txt2;

    ArrayList<listView> list = new ArrayList<listView>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list.add(new listView(R.drawable.cheeze, "치즈 브레드","335kcal"));
        list.add(new listView(R.drawable.masitta , "마시따","330kcal"));
        list.add(new listView(R.drawable.holic, "피자 홀릭","325kcal"));
        list.add(new listView(R.drawable.chiabata, "치아바타","250kcal"));
        list.add(new listView(R.drawable.mandu, "찐만두","425kcal"));

        DTOadapter adapter =
                new DTOadapter(getApplicationContext(), list, R.layout.list_row);


        listView = (ListView)findViewById(R.id.ListView1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), explain.class);
                intent.putExtra("img",list.get(position).img);
                intent.putExtra("text",list.get(position).txt);
                intent.putExtra("calories",list.get(position).txt2);

                startActivity(intent);
            }
        });

    }




}
