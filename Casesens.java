// Case-Sensitive String Equality
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int len1 = 0, len2 = 0;
        for (char c : s1.toCharArray()) len1++;
        for (char c : s2.toCharArray()) len2++;
        if (len1 != len2) {
            System.out.println("no");
            return;
        }
        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}