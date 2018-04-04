package com.bear.coding.ex05_14;

import android.icu.util.Calendar;
import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker picker;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picker = (DatePicker)findViewById(R.id.datePicker1);

        //CalenderView 객체 얻기
        CalendarView cView = picker.getCalendarView();

        //이벤트 처리
        cView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year,
                                            int month, int dayOnMonth) {

                String mesg = year + "년" + month + "월" + dayOnMonth +"일";
                Toast.makeText(getApplicationContext(), mesg, Toast.LENGTH_SHORT).show();
            }

        });
    }
}
