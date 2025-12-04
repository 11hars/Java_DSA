// Odd Digits in a Number
import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String numStr = Integer.toString(N);

        StringBuilder result = new StringBuilder();
       
        for (char ch : numStr.toCharArray()) {
            int digit = ch - '0';
            if (digit % 2 != 0) {     
                result.append(digit).append(" ");
            }
        }

        if (result.length() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(result.toString().trim());
        }
    }
}
