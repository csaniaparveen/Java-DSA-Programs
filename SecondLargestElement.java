import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        // Check if array has at least 2 elements
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        Arrays.sort(arr);

        System.out.println("Second largest element = " + arr[arr.length - 2]);
    }
}
