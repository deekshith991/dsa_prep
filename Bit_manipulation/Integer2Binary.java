
package Bit_manipulation;
import java.util.Scanner;

/**
 * Integer2Binary
 */
public class Integer2Binary {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        System.out.println(convert(n));
    }

    public static String convert( int n) {
        
        StringBuffer res = new StringBuffer(); 
        while( n != 0){
            if( n%2 == 1){
                res.append(1);
            }else{
                res.append(0);
            }
            n=n/2;
        }
        //res.append(1);

        String str = new String( res.reverse() );
        return str;
    }
}
