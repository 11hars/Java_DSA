import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        if(userInput%7==0)
        System.out.print("yes");
        else 
        System.out.print("no");
    }
}