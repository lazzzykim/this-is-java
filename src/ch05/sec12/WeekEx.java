package ch05.sec12;

import java.util.Calendar;

public class WeekEx {
    public static void main(String[] args) {
        // Week 열거타입 변수선언
        Week today = null;

        // Calendar 얻기
        Calendar cal = Calendar.getInstance(); // 컴퓨터 날짜 및 시간 정보를 가진 Calender 객체 얻고 참조값 cal에 대입

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }

        // 열거타입 변수를 사용
        if (today == Week.SUNDAY) {
            System.out.println("일요일엔 휴식을 합니다.");
        } else {
            System.out.println("자바공부를 합니다.");
        }
    }
}
