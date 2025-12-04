// Vowel Check in String
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        String str = s.nextLine().toLowerCase();
        System.out.println(str.matches(".*[aeiou].*") ? "yes" : "no");
    }
}