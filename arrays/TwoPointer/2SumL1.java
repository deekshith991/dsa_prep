

public class Twosum{

  public int[] TwoSum (int[] nums, int target){


    int sum = 0;
    int[] pointer = {0,0}; 

    for ( int i = 0; i< nums.length-1 ; i++){
      sum = nums[i];
      for( int j =i+1 ; j < nums.length ; j++){

        if( sum + nums[j] == target ){
            pointer[0] = i;
            pointer[1] = j;

            return pointer;
        } 
      }
    }

    return null;
  }
}
