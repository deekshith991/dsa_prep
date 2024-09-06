

package Bit_manipulation;
import java.util.Scanner;
/**
 * CountSetBits
 */
public class CountSetBits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println( count_simple(n));
        System.out.println( count_fast(n));
    }

    public static int count_simple( int n ) {
        int cnt=0;
        while (n!=0) {
            if( (n&1) == 1) cnt++;
            n=n>>1;
        }
        return cnt;
    }

    public static int count_fast( int n ) {
        int cnt=0;

        while(n!=0){
            n= n&n-1;
            cnt++;
        }

        return cnt;
    }
}
