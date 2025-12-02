import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of List 1: ");
        int n1 = scanner.nextInt();

        List<Integer> list1 = new ArrayList<>();
        System.out.println("Enter elements of List 1:");
        for (int i = 0; i < n1; i++) {
            list1.add(scanner.nextInt());
        }
        System.out.print("Enter the size of List 2: ");
        int n2 = scanner.nextInt();
        List<Integer> list2 = new ArrayList<>();
        System.out.println("Enter elements of List 2:");
        for (int i = 0; i < n2; i++) {
            list2.add(scanner.nextInt());
        }
        Set<Integer> mergedSet = new LinkedHashSet<>();
        mergedSet.addAll(list1);
        mergedSet.addAll(list2);
        List<Integer> mergedList = new ArrayList<>(mergedSet);
        System.out.println("Merged list without duplicates: " + mergedList);
        scanner.close();
    }
}