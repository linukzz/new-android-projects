package com.bear.coding.ex05_15;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int year;
    private static int monthOfyear;
    private static int dayOfMonth;


    @Override
   public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // end onCreate


    public void show(View v) {

        MyDialogFragment frag = MyDialogFragment.newInstance();
        frag.show( getFragmentManager(), "TAG");
    } //

    public static class MyDialogFragment extends DialogFragment {

        public static MyDialogFragment newInstance() {
            return new MyDialogFragment();
        }

            @Override
                    public Dialog onCreateDialog(Bundle savedInstanceState) {
                DatePickerDialog dialog =
                        new DatePickerDialog( getActivity(), callBack, year,
                                monthOfyear, dayOfMonth);
                return dialog;

            } //


            DatePickerDialog.OnDateSetListener callBack =
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month,
                                              int dayOfMonth) {
                            MainActivity.year = year;
                            MainActivity.monthOfyear = monthOfyear;
                            MainActivity.dayOfMonth = dayOfMonth;

                            String mesg = year + "년" + (monthOfyear+1)+"월" + dayOfMonth +
                                    "일";
                            Toast.makeText(getActivity(), mesg, Toast.LENGTH_SHORT).show();

                        }
                    };

    } // end MyDialogFragment
} // end class
