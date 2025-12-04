import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int user1 = obj.nextInt();
        int user2 = obj.nextInt();
        int m=user1+user2;
        if(m%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}