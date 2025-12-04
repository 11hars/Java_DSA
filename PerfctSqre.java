// Perfect Square Product
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int M = obj.nextInt();
        int prod=N*M;
        int sq = (int) Math.sqrt(prod);

        if (sq * sq == prod) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
    }
}