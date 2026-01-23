
public class MaxElementArray {

    public static int findMaximum(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23};

        int maxElement = findMaximum(arr);

        System.out.println("Maximum element is: " + maxElement);
    }
}
