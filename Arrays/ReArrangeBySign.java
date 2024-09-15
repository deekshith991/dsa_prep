package Arrays;

import Utility.io;
import java.util.ArrayList;

/**
 * ReArrangeBySign
 */
public class ReArrangeBySign {

  
  public static void main(String[] args) {
    int arr[] = { 2 , -3 , 4 , 5 , 6, 8 , -2 , -3 , -4 ,-9} ;
    io.display(arr);

    solution(arr);
  }

  public static void solution(int[] arr){
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> neg = new ArrayList<>();

    for (int i = 0; i < arr.length ; i++) {
      if(arr[i]>0)
        pos.add(arr[i]);
      else
        neg.add(arr[i]);
    }

    int i=0,j=0,k=0;
    while (i<pos.size() && j < neg.size()) {
      arr[k++] = pos.get(i++);
      arr[k++] = neg.get(j++);
    }
    io.display(arr);
  }
}
