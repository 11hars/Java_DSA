// Second Smallest Element
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        if (N < 2) {
            System.out.println(-1);
            return;
        }
        int frst = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int num = obj.nextInt();
            if (num < frst) {
                sec = frst;
                frst = num;
            } else if (num > frst && num < sec) {
                sec = num;
            }
        }
        if (sec == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(sec);
        }
    }
}