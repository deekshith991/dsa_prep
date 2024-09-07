
package Bit_manipulation;
import java.util.Scanner;


public class MinSetBitsToChanage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int target = sc.nextInt();

        sc.close();

        System.out.println( count(number , target) );
    }

    public static int count( int number , int target ){

        int ans = number^target;
        int cnt=0;

        while(ans!=0){
            if( (ans&1) == 1 ) cnt++;
            ans = ans>>1;
        }

        return cnt;
    }
}
