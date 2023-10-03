package chapter05.sec03.exam02;

import chapter05.sec03.exam01.Week;

import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance(); // 현재 시간 상태
        int week = cal.get(Calendar.DAY_OF_WEEK); // 현재 시간 상태중에서 요일을 가져오기

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }

        System.out.println("오늘 요일: " + today);

        if(today == Week.SATURDAY || today==Week.SUNDAY){
            System.out.println("주말입니다.");
        }
    }
}
