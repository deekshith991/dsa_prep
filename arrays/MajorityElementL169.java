

public class MajorityElementL169{

  public int solution( int[] nums){

    int majority = nums[0];
    int cnt = 0;

    for( int i = 0 ; i< nums.length; i++){
      if( cnt ==0 ){
        majority = nums[i];
      }
      if( majority == nums[i])
          cnt++;
      else
          cnt--;
    }
  }
  return majority;
}
