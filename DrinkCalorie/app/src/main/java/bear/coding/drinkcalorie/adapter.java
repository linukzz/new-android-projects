package bear.coding.drinkcalorie;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by 이민석 on 2018-03-04.
 */

public class adapter extends BaseAdapter {

    Context ctx;
    int layout;
    ArrayList<listview> list;
    LayoutInflater inf;

    public adapter(Context ctx, int layout, ArrayList<listview> list, LayoutInflater inf) {
        this.ctx = ctx;
        this.layout = layout;
        this.list = list;


        inf = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
       return list.size();
    }

    @Override
    public Object getItem(int position){
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            convertView =inf.inflate(layout, null);
        }

        ImageView imageView2 =
                (ImageView)convertView.findViewById(R.id.imageView2);
        TextView txtContent =
                (TextView)convertView.findViewById(R.id.txtContent);

        listview List = list.get(position);

        imageView2.setImageResource(List.getimg());
        txtContent.setText(List.getContent());

        return convertView;
    }


    // 연결해주는 접점


}
