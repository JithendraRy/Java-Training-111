
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        String[] arr = {"cat", "dog", "mouse", "elephant", "cat", "mouse", "lion", "zebra"};
        int n = arr.length;

        // find the duplicate values in the array
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            if (!set.add(arr[i])) {
                System.out.println("Duplicate value found: " + arr[i]);
            }
        }
    }
}
