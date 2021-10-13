import java.util.Scanner;

public class Time {

    private int second;
    private int minute;
    private int hour;

    public Time() {
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    public Time(int second, int minute, int hour) {
        Scanner scn = new Scanner(System.in);
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void add(int h, int m, int s) {
        long nowTimeForAnyDay;
        long fraimTimeForHead;

        nowTimeForAnyDay = hour * 60 * 60 + minute * 60 + second;
        fraimTimeForHead = h * 60 * 60 + m * 60 + s;

        long allTime = nowTimeForAnyDay + fraimTimeForHead;

        hour = (int) (allTime/(60 * 60));
        allTime = allTime - hour * 60 * 60;
        minute = (int) (allTime /60);
        allTime = allTime - minute * 60;
        second = (int) allTime;
    }
}
