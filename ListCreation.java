import java.util.*;
public class ListCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        System.out.print("Enter number of elements for List 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements for List 1:");
        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }
        System.out.println("List 1: " + list1);
        sc.close();
    }
}