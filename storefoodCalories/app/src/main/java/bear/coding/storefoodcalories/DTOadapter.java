package bear.coding.storefoodcalories;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;

/**
 * Created by 이민석 on 2018-03-04.
 */

public class DTOadapter extends BaseAdapter {

    Context ctx;
    LayoutInflater inf;
    ArrayList<listView> list;
    int layout;

    public DTOadapter(Context ctx, ArrayList<listView> list, int layout) {
        this.ctx = ctx;
        this.layout = layout;
        this.list = list;

        inf = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inf.inflate(layout, null);
        }
        ImageView img =
                (ImageView) convertView.findViewById(R.id.img);

        TextView txt =
                (TextView) convertView.findViewById(R.id.txt);

        TextView txt2 = (TextView)convertView.findViewById(R.id.txt2);


        listView dto = list.get(position);
        img.setImageResource(dto.img);
        txt.setText(dto.txt);
        txt2.setText(dto.txt2);


        return convertView;
    }

}

class food {
    int img;
    String txt="";
    String txt2="";

    public food(int img, String txt, String txt2) {
        super();
        this.img = img;
        this.txt = txt;
        this.txt2 = txt2;
    }

    public food() {}
}