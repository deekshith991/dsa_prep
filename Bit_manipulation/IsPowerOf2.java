package Bit_manipulation;

import java.util.Scanner;
/**
 * IsPowerOf2
 */
public class IsPowerOf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println( isit(n));
    }

    public static boolean isit(int n) {
        if( (n&(n-1)) == 0)
            return true;
        else return false;
    }
}
