

public class InsertionSort {
  
  public static void main( String arg[]) {

    int[] arr = {3,5,3,2,4,5,5,3,76,4,2,8};

    Sort(arr);
    display(arr);
  }

  public static void display( int[] arr){
    for( int i : arr){
      System.out.print(i+ " ");
    }
    System.out.println();
  }

  public static void Sort( int[] arr){

    for( int i = 0 ;i< arr.length-1 ; i++){
      for( int j =0; j< arr.length-i-1 ; j++){
        if( arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
}
