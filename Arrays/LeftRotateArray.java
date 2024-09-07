
package Arrays;
/**
 * LeftRotateArray
 */
public class LeftRotateArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6};

        leftRotate(arr, 3);
        for(int i: arr)
            System.out.print( i +" ");
    }

    public static int[] leftRotate( int[] arr , int n) {

        int temp[] = new int[n];

        for( int i=0; i<n ; i++){
            temp[i] = arr[i];
        }

        int j=0;
        for (int i = n; i < arr.length; i++) {
            arr[j] = arr[i];
            j++;
        }

        for(int i=0; i<temp.length ; i++){
            arr[j] = temp[i];
            j++;
        }

        return arr;
    }
}
