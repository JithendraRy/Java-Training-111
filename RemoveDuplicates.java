import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3};
        int n = arr.length;

        // sort the array
        Arrays.sort(arr);

        // remove duplicates
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        // copy the non-duplicate elements back into the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        // print the array without duplicates
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
