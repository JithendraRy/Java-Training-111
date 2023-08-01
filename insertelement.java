public class insertelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int pos = 3;
        int x = 10;

        // create a new array of size n+1
        int[] newarr = new int[n + 1];

        // copy the elements of the old array into the new array
        for (int i = 0; i < n; i++) {
            newarr[i] = arr[i];
        }

        // shift the elements of the new array from position pos to the right
        for (int i = n - 1; i >= pos - 1; i--) {
            newarr[i + 1] = newarr[i];
        }

        // insert the element x at position pos-1
        newarr[pos - 1] = x;

        // print the new array
        for (int i = 0; i < n + 1; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
