package com.example.schedule_management_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.schedule_management_project.Decorator.SundayDecorator;
import com.example.schedule_management_project.Decorator.SaturdayDecorator;
import com.example.schedule_management_project.Decorator.TodayDecorator;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;

public class CalendarActivity extends AppCompatActivity {

    private MaterialCalendarView calendarview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarview = findViewById(R.id.calendarView);
        calendarview.addDecorators(new SundayDecorator(), new SaturdayDecorator(),new TodayDecorator());

        //클릭시 이벤트
        calendarview.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {

            }
        });

    }
}