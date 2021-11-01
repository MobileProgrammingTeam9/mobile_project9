package com.example.schedule_management_project.Decorator;

import android.graphics.Color;
import android.text.style.ForegroundColorSpan;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;

import java.util.Calendar;

// 오늘을 magenta 색으로 표시
public class TodayDecorator implements DayViewDecorator {

    private CalendarDay today;

    public TodayDecorator(){
        today = CalendarDay.today();
    }
    @Override
    public boolean shouldDecorate(CalendarDay day){
        return today != null && day.equals(today);
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.addSpan((new ForegroundColorSpan(Color.MAGENTA)));
    }
}
