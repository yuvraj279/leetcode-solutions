class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int k: map.keySet()){
            if(map.get(k)>nums.length/3){
                ans.add(k);
            }
        }
        return ans;
    }
}