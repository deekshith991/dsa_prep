
//{ Driver Code Starts
// Initial Template for Java
package Arrays;

import java.util.Arrays;
import java.util.*;
//import java.util.stream.Collectors;
//import java.io.*;

public class SecondLargest {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            sol ob = new sol();
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
        sc.close();
    }
}

// User function Template for Java

class sol {
    public int print2largest(int[] arr) {

        int large = 0;
        int SecLarge = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                SecLarge = large;
                large = arr[i];
            }

            if (arr[i] < large && arr[i] > SecLarge) {
                SecLarge = arr[i];
            }
        }

        return SecLarge;

    }
}
