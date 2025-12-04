//Area of rectangle
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float  L = obj.nextFloat();
        float  B = obj.nextFloat();
        
        float op =L*B;
        System.out.printf("%.5f",op);
        
    }
}