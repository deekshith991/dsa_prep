package Utility;
import java.util.Random;
import java.util.Scanner;

public class io {
    //private static Scanner sc = new Scanner(System.in);
    public static void main( String arg[] ) {

    }

    public static int input() {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter num: ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public static int[] input(int[] arr){

      Scanner Sc = new Scanner(System.in);

      for(int i=0; i<arr.length ; i++){
        arr[i] = Sc.nextInt();
      }

      Sc.close();

      return arr;
    }

    public static void display(int[] arr){
      for( int i=0; i<arr.length ; i++){
        System.out.print(arr[i]+" ");
      }System.out.println();
    }

    public static int[] randArr(){
      Random r = new Random();

      int size = 30;
      int[] arr = new int[r.nextInt(size)];

      for (int i = 0; i < arr.length; i++) {
        arr[i] = r.nextInt(-20, 20);
      }

      return arr;
    }

    public static int rendNum(){
      Random r = new Random();
      return r.nextInt(15);
    }

}
