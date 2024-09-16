

package Arrays;
import Utility.io;
// import java.util.Arrays.Sort;



/**
 * NextPermutation
 */
public class NextPermutation {

  public static void main(String[] args) {
    int arr[] = { 3,2,1};

    solution(arr);
  }

  public static void solution(int arr[]){

    io.display(arr);
    
    int Breakpoint = 0;
    for (int i = 0; i < arr.length-1 ; i++) {
      if( arr[i] < arr[i+1] ){
        Breakpoint = i;
      }
    }

    // System.out.println(Breakpoint);

    int small = Integer.MAX_VALUE;
    int swpPoint =-1 ;
    
    for (int i = Breakpoint ; i < arr.length; i++) {
      if( arr[i] > arr[Breakpoint] && small > arr[i]){
        small = arr[i];
        swpPoint = i;
      }
    }

    if( swpPoint == -1){
      for(int i=0; i<arr.length/2 ; i++){
        int temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-1-i] = temp;
      }
      // io.display(arr);
      return;
    }

    // System.out.println(swpPoint);

    int temp = arr[Breakpoint];
    arr[Breakpoint] = arr[swpPoint];
    arr[swpPoint] = temp;



    // io.display(arr);

    for( int i=Breakpoint ; i<arr.length ; i++){
      for( int j=Breakpoint+1 ; j<arr.length-1 ; j++){
        if( arr[j] > arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
        // io.display(arr);
      }
    }


    io.display(arr);

  }
}
