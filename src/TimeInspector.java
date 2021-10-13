import java.util.Scanner;

public class TimeInspector {
    public static void main(String[] args) {
        Time t1 = new Time();
        Scanner scn = new Scanner(System.in);

        int h = 12;
        int m = 32;
        int s = 48;

        t1.setHour(h);
        t1.setMinute(m);
        t1.setSecond(s);

        Time t2 = new Time(s, m, h);
    }
}
