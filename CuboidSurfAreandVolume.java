//Cuboid Surface Area and Volume
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int L= obj.nextInt();
        int B= obj.nextInt();
        int H= obj.nextInt();
        int surfarea= 2*(L*B+B*H+H*L);
        int volume = L*B*H;
        System.out.print(surfarea+" "+volume);
    }
}