
package Bit_manipulation;
import java.util.Scanner;

/**
 * RemoveLastSetBit
 */
public class RemoveLastSetBit {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.close();

       //System.out.println( Integer2Binary.convert(n) );
       System.out.println( RemoveLastBit(n));
       //System.out.println( Integer2Binary.convert( RemoveLastBit(n)) );
   }

   public static int RemoveLastBit(int n) {
       return (n&(n-1));
   }
}

