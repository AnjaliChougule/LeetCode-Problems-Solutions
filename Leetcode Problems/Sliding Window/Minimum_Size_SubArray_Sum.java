class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, r=0, sum=0;
        int result = Integer.MAX_VALUE;
        int size = nums.length;
        while (l <= r && r<size){
            sum += nums[r];
            while(sum >= target){
                result = Math.min(result, r-l+1);
                sum -= nums[l];
                l++;
            }
            r++;
        } 

        if (result != Integer.MAX_VALUE){
            return result;
        }
        return 0;
    }
}