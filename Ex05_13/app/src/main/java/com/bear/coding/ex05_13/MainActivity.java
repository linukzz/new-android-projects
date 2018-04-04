package com.bear.coding.ex05_13;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } //end onCrete

    public void alertShow(View v) {

        MyDialogFragment frag = MyDialogFragment.newInstance();
        frag.show(getFragmentManager(), "TAG");
    } // end alertShow

    public static class MyDialogFragment extends DialogFragment {

        public static MyDialogFragment newInstance() {
            return new MyDialogFragment();
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            //커스텀 객체 구하기

            LayoutInflater inf =
                    (LayoutInflater)getActivity().getSystemService
                            (Context.LAYOUT_INFLATER_SERVICE);

            View convertView = inf.inflate(R.layout.customdialog, null);
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("타이틀");
            builder.setView( convertView ); //커스텀 객체 설정
            builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Log.i("My Tag", "확인선택");
                }
            });
        return builder.create();
        }//
    }// end MyDialog


}// end class
