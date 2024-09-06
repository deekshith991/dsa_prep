

package Bit_manipulation;
import java.lang.Math;
import java.util.Scanner;
/**
 * Binary2Decimal
 */
public class Binary2Decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine();
        sc.close();

        System.out.println( convert(s));
    }

    public static int convert( String s) {
        
        int ans = 0;
        int j =0;
        for( int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)=='1'){
                ans += Math.pow(2, j);
            }
            j++;
        }
        return ans;
    }
}
