package Arrays;

class SortedandRotatedL1752 {
    public boolean check(int[] nums) {
        int cnt = 0;
        if( nums[0] < nums[nums.length-1])
            cnt++;
        for( int i = 0; i < nums.length-1 ; i++ ){
            if( nums[i] > nums[i+1] )
                cnt++;
        }

        if( cnt <= 1)
            return true;
        else
            return false;
    }
}
