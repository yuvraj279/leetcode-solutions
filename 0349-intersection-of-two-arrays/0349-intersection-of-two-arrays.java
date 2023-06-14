class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        for(int i: nums1){
            set.add(i);
        }

        List<Integer>result=new ArrayList<>();
        for(int i:nums2){
            if(set.contains(i)){
                result.add(i);
                set.remove(i);
            }
        }
        int [] ans=new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}