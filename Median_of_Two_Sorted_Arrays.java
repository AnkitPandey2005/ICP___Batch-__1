import java.util.*;
public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] arr1 = new int[m];
        for(int i = 0; i < m; i++) {
            arr1[i] = in.nextInt();
        }
        int n = in.nextInt();
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }
        in.close();  // Good practice

        double z = findMedianSortedArrays(arr1, arr2);
        System.out.printf("%.5f\n", z);
    }

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Merge smaller arrays first
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                ans.add(arr1[i++]);
            } else {
                ans.add(arr2[j++]);
            }
        }

        // Add remaining elements
        while (i < n1) ans.add(arr1[i++]);
        while (j < n2) ans.add(arr2[j++]);

        int total = n1 + n2;
        if (total % 2 == 1) {
            return ans.get(total / 2);
        } else {
            return (ans.get(total / 2) + ans.get(total / 2 - 1)) / 2.0;
        }
    }
}
