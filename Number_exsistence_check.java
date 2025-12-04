// Number Existence Check
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == k) {
                found = true;
            }
        }
        System.out.println(found ? "yes" : "no");
    }
}
