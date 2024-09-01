

package Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * StringSplitter
 */
public class StringSplitter {

    public static String getString(){

        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        */

        String s = "jsdcjhb mdgjcsgjh \"skgczj kjgcbdsjb jhfhas \" jhgdash \"hhjgsajh hgvs kjkee\" jghjgdaehjh" ;
        return s;
    }

    public static String[] splitter( String str ){

        String word = new String();
        ArrayList<String> arr = new ArrayList<>();

        for( int i=0 ; i < str.length() ; i++){
            if( str.charAt(i) != ' '){
                word+=str.charAt(i);
            } else {
                arr.add( word );
                word="";
            }
        }
        arr.add(word);

        String[] ans = new String[ arr.size() ];
        arr.toArray(ans);

        /*
        for( String i: ans){
            System.out.println(i);
        }*/ 

        return ans ;
    }

    public static String[] strings( String[] arr){

        ArrayList<String> temp = new ArrayList<>();

        for( int i=0; i<arr.length ; i++){
            
            if( arr[i].charAt(0) != '"'){
                temp.add(arr[i]);
            }
        }

        String[] ans = new String[temp.size()];

        ans= temp.toArray(ans);

        for( String i: ans)
            System.out.println(i);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println( getString() );

        strings( splitter(getString()));
    }
}
