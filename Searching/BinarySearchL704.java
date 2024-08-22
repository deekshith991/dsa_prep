
class Solution {
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;

        while( high >= low){
            int mid = (low+high)/2;
            if( arr[mid] == target){
                return mid;
            }

            if( arr[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
