// Product of Digits
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine().trim();
        long product = 1;
        for (int i = 0; i < num.length(); i++) {
            product *= (num.charAt(i) - '0');
        }
        System.out.println(product);
    }
}