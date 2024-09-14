
package Algorithms.Arrays;
import Utility.io;

/**
 * Kadane
 */
public class Kadane {

  public static void main(String[] args) {
    int[] arr = io.randArr();
    io.display(arr);

    System.out.println( solution(arr) );
  }

  public static int solution(int[] arr){

    int maxi = Integer.MIN_VALUE;
    int sum =0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if( sum > maxi)
        maxi = sum;

      if( sum < 0)
        sum = 0;
    }
    return sum ;
  }
}
