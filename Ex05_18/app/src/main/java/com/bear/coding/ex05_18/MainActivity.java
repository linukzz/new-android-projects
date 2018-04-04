package com.bear.coding.ex05_18;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static int currentHour;
    static int currentMinute;
    static int currentSeconds;
    static boolean is24Mode; // 24시간 표기 모드


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View v) {

        MyDialogFragment frag = MyDialogFragment.newInstance();
        frag.show(getFragmentManager(), "TAG");
    }

    public static class MyDialogFragment extends DialogFragment {

        public static MyDialogFragment newInstance() {

            return new MyDialogFragment();

        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            //현재 시간으로 데이터 설정
            TimePickerDialog dialog =
                    new TimePickerDialog(getActivity(), callBack, currentHour,
                            currentMinute, is24Mode);
            return dialog;
        }

        TimePickerDialog.OnTimeSetListener callBack =
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        currentHour = hourOfDay;
                        currentMinute = minute;
                        String mesg = hourOfDay + "시" + minute + "분";
                        Toast.makeText(getActivity(), mesg, Toast.LENGTH_SHORT).show();
                    }
                };

    }
}



