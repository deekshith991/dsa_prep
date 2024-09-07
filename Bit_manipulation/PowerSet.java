package Bit_manipulation;
import java.lang.Math;
/**
 * PowerSet
 *
 * print all subsetts of a arr;
 * arr = [1,2,3]
 *
 * ans = [ [] , [1] , [2] , [3] , [1,2] , [1,3] , [2,3] , [1,2,3] ] 
 */
public class PowerSet {

    public static void main(String[] args) {
        int[] arr = {1,2,7,8,3};

        int ans[][] = subSets(arr);

        for(int[] i: ans ){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static int[][] subSets( int[] arr ) {

        int len = (int)Math.pow(2, arr.length);
        int[][] ans = new int[len][arr.length];

        for ( int i=0; i<len ; i++){
            int n = i;
            int cnt=0;

            while(n!=0){
                if( (n&(1))==1 ){
                    ans[i][cnt] = arr[cnt];
                }
                cnt++;
                n = n>>1;
            }
        }

        return ans;
    }
}
