import java.util.*;
public class Searchelemnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        System.out.print("Enter number of elements for List 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter elements for List 1:");
        
        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }
        List<Integer> list2 = new ArrayList<>();
        System.out.print("Enter number of elements for List 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter elements for List 2:");
        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        } 
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        List<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list2);
        System.out.println("Merged List: " + merged);
                        System.out.print("Enter element to search: ");
        int searchVal = sc.nextInt();

        if (merged.contains(searchVal)) {
            System.out.println("Element found at index: " + merged.indexOf(searchVal));
        } else {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}