package com.bear.coding.ex05_11;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // end onCrete

    public void alertShow(View v) {

        MyDialogFragment frag = MyDialogFragment.newInstance();
        frag.show( getFragmentManager(), "TAG");
    } // end alertShow

    public static class MyDialogFragment extends DialogFragment {

        //배열 생성
        String [] data = new String[] {"A", "B", "C"};

        public static MyDialogFragment newInstance() {

            return new MyDialogFragment();
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {


            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("타이틀");
            builder.setSingleChoiceItems( data, 1, new DialogInterface.OnClickListener() {

                @Override
                public void onClick( DialogInterface dialog, int which) {

                    Log.i("My Tag", data[which]);
                    dialog.dismiss(); // 다이얼 로그창 닫기

                }
            });

            return builder.create();
        }



    }



}
