import java.util.*;
public class ListInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        System.out.print("Enter number of elements for List 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements for List 1:");
        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }
        System.out.print("Enter an element to insert: ");
        int insertVal = sc.nextInt();
        System.out.print("Enter index to insert at: ");
        int insertIndex = sc.nextInt();

        if (insertIndex >= 0 && insertIndex <= list1.size()) {
            list1.add(insertIndex, insertVal);
        } else {
            System.out.println("Invalid index! Skipping insertion.");
        }

        System.out.println("After insertion: " + list1);
        System.out.println("List 1: " + list1);
        sc.close();
    }
}