
package BinarySearch;
import java.util.Scanner;
import Utility.io;
/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 6, 7, 8, 8, 9, 10, 11, 11, 13, 34, 34, 45, 45 };

        Scanner sc = new Scanner(System.in);

        //int n = io.inputnum();

        for(int i: arr){
            System.out.print( i + " ");
        }System.out.println();

        int target = sc.nextInt();
        sc.close();


        System.out.println(lowerBound(arr, target));

    }

    public static int lowerBound(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;
        //System.out.println(high);

        if( target <= arr[0] )
            return 0;
        if( target > arr[high])
            return -1;

        while (low <= high) {
            int mid = (low + high) >> 1;
            //System.out.println(mid);

            if( arr[mid] < target){
                low = mid;
            }
            else if ( arr[mid] >= target && arr[mid-1] < target){
                return mid;
            }
            else{
                high = mid;
            }

        }

        return -1;
    }

    public static int upperBound(int arr[], int target) {

        int low = 0;
        int high = arr.length-1;

        while ( low <= high ){
            int mid = (low+high) >> 1;

            if( arr[mid] > target){
                high = mid;
            }

            return 0;
        }

        return -1;
    }
}
