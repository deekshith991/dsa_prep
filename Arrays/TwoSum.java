package Arrays;
import java.util.Map;
import Utility.io;

import java.util.HashMap;

public class TwoSum {

  public static void main(String[] args) {
    int[] arr = { 23,3,5,87,8,8,5,4,9,2,9};
    int target = 11;

    io.display(arr);

    int ans[] = new int[2];
    ans = solution(arr,target);
    io.display(ans);

    ans = optimized(arr, target);
    io.display(ans);
  }

  public static int[] solution(int arr[] , int target) {

    int ans[] = {0,0};
    
    for(int i=0 ; i<arr.length-1 ; i++){
      for (int j = i+1; j < arr.length; j++) {
        if( target == (arr[i]+arr[j] )){
          ans[0] = i; ans[1] = j;
          return ans;
        }
      }
    }
    
    return ans;
  }

  public static int[] optimized( int[] arr, int target){

    int[] ans = {0,0};
    Map<Integer,Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length ; i++) {
      map.putIfAbsent(arr[i], i);
    }

    for (Map.Entry<Integer, Integer> e : map.entrySet()){
      int val = target-e.getKey();

      if( map.containsKey(val) ){
        
        ans[0] = e.getValue();
        ans[1] = map.get(val);
        return ans;
      }
    }

    return ans;
  }
}
