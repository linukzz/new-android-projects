package com.example.ex04_09;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.ex04_09.R.id.imgIcon;
import static com.example.ex04_09.R.id.txtContent;
import static com.example.ex04_09.R.id.txtcontent;

/**
 * Created by 이민석 on 2018-01-11.
 */


public class MycustomAdapter extends BaseAdapter {

    Context ctx;
    int layout;
    ArrayList<MycustomDTO> list;
    LayoutInflater inf;


    public MycustomAdapter(Context ctx, int layout, ArrayList<MycustomDTO> list) {

        this.ctx = ctx;
        this.layout = layout;
        this.list = list;
        inf = LayoutInflater.from(ctx);
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
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        MycustomDTO dto = list.get(position);
        Log.d("tag",position+",");
        //자 설명을 해드리면 일단 getView 라는 이메소드는 최초에 화면갯수만큼 로딩을해요
        //그리고나서 스크롤 될때마다 지속적으로 호출이 됩니다.
        //보이시죠?
        // 여기서 아까와 같은 코딩의 문제점은

        //리스트뷰에서 뷰홀더 패턴을 이용한 뷰의 재사용성 코딩
        ViewHolder holder;
        //최초 뷰가 없을때 null 일때 뷰홀더 클래스를 초기화를해주고 각각의 위젯의 초기화를 단 1번만 해줍니다.
        if (convertView == null) {
            //딱 한번 실행됨
            holder = new ViewHolder();
            convertView = inf.inflate(layout, null);
            holder.txtTitle = convertView.findViewById(R.id.txtTitle);
            holder.txtContent = convertView.findViewById(R.id.txtContent);
            holder.imgIcon = convertView.findViewById(R.id.imgIcon);
            //그리고나서 컨버터뷰 즉 리스트뷰에 요 홀더를 붙여줍니다 옷에다가 태그 (라벨) 붙이는것과 같은 원리에요
            convertView.setTag(holder);
        } else {
            //그리고 뷰가 null이아닐때 우리는 컨버터뷰에서 holder를 가져오지요
            //여기서 holder를 가져오게되면 가져온 홀더는 이미 내부위젯들은 초기화가 된상태입니다.
            //if문안에서 초기화를 해주고 붙여줫기때문이지요
            holder = (ViewHolder) convertView.getTag();
        }
        //여기서 ImageView imagevew = .... 이런식으로 코딩이 되있엇죠
        // 그렇다고한다면 우리는 스크롤 할때마다 이미지뷰를 새로 생산하고있게 되는거에요
        //그렇게된다면 스크롤할때마다 메모리가 점점 늘어나다가 결국엔 느려지거나 뻑이날 가능성이 높습니다
        //그래서 고안된 패턴이 뷰홀더 패턴이라는건데 이것은 최초의 1번만 생성을하고 안의 내용 컨텐츠만 바꿔주는식으로 코딩을하는거죠


        //그리고나서 여기서는 홀더를 이용해서 내용만 바꿔줍니다. 이렇게되면 위젯을 한번만생성하고 그안에 내용 바꿔주는 메소드만 이용하여
        // 메모리 사용을 엄청나게 절약할수 있어요

        //그리고 방금 오류났던거는 xml 에
        holder.txtTitle.setText(dto.getTitle());
        holder.txtContent.setText(dto.getContent());
        holder.imgIcon.setImageResource(dto.getImgIcon());
        return convertView;
    }
    class ViewHolder {
        TextView txtTitle,txtContent;
        ImageView imgIcon;
    }

}







