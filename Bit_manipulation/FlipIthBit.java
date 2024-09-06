

package Bit_manipulation;
import java.util.Scanner;

/**
 * FlipIthBit
 */
public class FlipIthBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int i = sc.nextInt();
        sc.close();

        System.out.println( Flip(n , i) );
    }

    public static int Flip( int n , int i) {
        return (n^(1<<i));
    }
}
