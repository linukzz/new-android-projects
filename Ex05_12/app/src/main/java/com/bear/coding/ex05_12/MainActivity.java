package com.bear.coding.ex05_12;

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }// end onCrete

    public void alertShow(View v) {
        MyDiaFragment frag = MyDiaFragment.newInstance();
        frag.show(getFragmentManager(), "TAG");
    } // end alertShow

    public static class MyDiaFragment extends DialogFragment {

        // 배열 생성
        String [] data   = new String[]{"A","B","C"};
        boolean []checked = {true,false, true, false};




        public static MyDiaFragment newInstance() {

            return new MyDiaFragment ();

        }

        @Override
        public Dialog onCreateDialog(Bundle saveInstanceState) {

            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("타이틀");
            builder.setMultiChoiceItems(
                    data, checked, new DialogInterface.OnMultiChoiceClickListener()  {
                        @Override
                        public void onClick(
                                DialogInterface dialog,
                                int which,
                                boolean isCheked) {

                            checked[which] = isCheked;
                        }
                    });
            builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {

                    for(int i=0; i< checked.length; i++) {
                        if(checked[i]) {
                            Log.i("MyTag", data[i]);

                        }
                    }
                }
            });


            return builder.create();

        }


    }
}

