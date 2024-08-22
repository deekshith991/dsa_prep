
import java.util.Arrays;

public class MissingNumber {

  public static void main(String[] args) {

    int[] nums = { -5, 7, 10, -34, 9, 9, 6, 6, 6, 6, 6, 6 };

    Arrays.sort(nums);

    // this is working & i don't get how

    // int k = 1;
    // for (int i : nums) {
    // if (i < 0) {
    // i = 0;
    // }
    // if (i > 0 && i == k) {
    // i = 0;
    // k++;
    // }
    // }

  }
}
