package Arrays;
import java.util.*;

/**
 * Leetcode
 */
public class Leetcode {

    //  no driver code for now
}





class Solution {

    /**
     * subsetsWithDup
     *
     * this problem we need to find sub sets but we don't need Dups 
     * solved using {@link Bit_manipulation.PowerSet} method
     * */

    public List<List<Integer>> subsetsWithDup(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        int length = (int) Math.pow(2, arr.length);

        for (int i = 0; i < length; i++) {
            int n = i;
            int cnt = 0;
            List<Integer> list = new ArrayList<>();
            while (n != 0) {
                if ((n & 1) == 1) {
                    list.add(arr[cnt]);
                }
                n = n >> 1;
                cnt++;
            }
            Collections.sort(list); // Collections framework has functions sort, reverseOrder , BubbleSearch, shuffle
            if(!ans.contains(list))
                ans.add(list);
        }
        //Collections.sort(ans);
        return ans;
    }

}
