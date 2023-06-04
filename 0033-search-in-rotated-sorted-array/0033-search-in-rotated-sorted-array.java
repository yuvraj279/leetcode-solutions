class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        return find(nums,target,s,e);
    }
    int find(int[] nums, int target, int s,int e){
        if(s>e){
            // ans not found
            return -1;
        }
        int mid=s+(e-s)/2;
        if(nums[mid]== target) return mid;
        if(nums[mid]>=nums[s]){
            if(target<=nums[mid]&& target>=nums[s]){
                return find(nums,target,s,mid-1);
            }else{
                return find(nums,target,mid+1,e);
            }
        }
        else if(nums[mid]<=nums[e]){
            if(target<=nums[e] && target>=nums[mid]){
                return find(nums,target,mid+1,e);
            }else{
                return find(nums,target,s,mid-1);
            }
            
        }else{
            return find(nums,target,s,mid-1);
        }
    }
}