

public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = {2, 4,5,21,1,4,5,5,43};

    display(arr);
    Sort(arr);
    display(arr);
  }

  public static void swap ( int arr[] ,int a , int b) {
    int temp = arr[a];
    arr[a] =  arr[b];
    arr[b] = temp;
  }

  public static void display( int arr[]) {

    if( arr.length == 0){
      System.out.println("Empty array");
    }
    for (int i = 0 ; i< arr.length ; i++) {
      System.out.print(arr[i] +" " );
    }

    System.out.println();
    
  }

  public static void Sort( int arr[] ){
    
    int size = arr.length-1;

    for( int i = 0 ; i < size-1 ; i++){

      int min = i+1 ;
      for( int j = i+1 ; j< size ; j++ ){
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      swap( arr , i , min);
    }

  }
} 
