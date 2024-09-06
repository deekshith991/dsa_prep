
package Bit_manipulation;
import java.util.Scanner;

public class SetIthBit {
    
    public static void main( String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        sc.close();

        System.out.println(setBit(n, i));

    }

    public static int setBit( int n , int i) {

        int j = 1<< i;
        return( n|j );
        
    }
}
