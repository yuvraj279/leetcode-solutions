class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
                count=0;
            }
            ans+=count;
        }
        return ans;
    }
}