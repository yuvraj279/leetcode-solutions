class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int index=0;
        perDup(nums,index,list);
        return list;
    }
    void perDup(int[] nums, int index, List<List<Integer>> list) {
        if (index== nums.length){
            List<Integer> ans=new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ans.add(nums[i]);
            }
            if (!list.contains(ans)){
                list.add(new ArrayList<>(ans));
            }
            return;
        }
        for (int i = index; i < nums.length ; i++) {
            swap(nums,i,index);
            perDup(nums,index+1,list);
            swap(nums,i,index);
        }
    }
    void swap(int []nums,int f,int s){
        if (nums[f]==nums[s]){
            return;
        }else {
            int temp=nums[f];
            nums[f]=nums[s];
            nums[s]=temp;
        }
    }
}