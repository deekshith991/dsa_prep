
import java.util.Scanner;

public class SetBitOrNot {
    
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        sc.close();

        System.out.println( setOrNot(n, i));

    }

    public static boolean setOrNot(int n , int i){
        int j = 1 << i;
        if( (n&j) != 0){
            return true;
        } else return false;

    }
}
