package com.example.ex04_11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by 이민석 on 2018-01-14.
 */

public class MyCustomAdapter extends BaseAdapter {

    Context ctx;
    int layout;
    ArrayList<MyCustomDTO> list;
    LayoutInflater inf;

    public MyCustomAdapter(Context ctx, int layout, ArrayList<MyCustomDTO> list) {

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
        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.imageView1);
        TextView txtName = (TextView) convertView.findViewById(R.id.textView1);

        MyCustomDTO dto = list.get(position);
        imgIcon.setImageResource(dto.getImgPhoto());
        txtName.setText(dto.getName());

        return convertView;
    }

}

