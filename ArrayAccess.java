import java.util.*;


public class ArrayAccess {

    public static void printElementAtIndex(int[] arr, int index) {

        if (index >= 0 && index < arr.length) {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter index to access: ");
        int index = sc.nextInt();

        printElementAtIndex(arr, index);

        sc.close();
    }
}
