public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];

        // find the maximum and minimum values in the array
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // print the maximum and minimum values
        System.out.println("Maximum value in the array is " + max);
        System.out.println("Minimum value in the array is " + min);
    }
}
