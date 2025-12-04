// Round to Nearest Greater Integer
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Double num = obj.nextDouble();
        int op=(int)Math.ceil(num);
        System.out.println(op);
    }
}