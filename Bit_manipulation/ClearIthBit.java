
package  Bit_manipulation;
import java.util.Scanner;

/**
 * ResetIthBit
 */
public class ClearIthBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        sc.close();

        System.out.println(ClearBit(n,i));

    }

    public static int ClearBit( int n , int i){
        
        return (n&(~(1<<i)));
    }
}
