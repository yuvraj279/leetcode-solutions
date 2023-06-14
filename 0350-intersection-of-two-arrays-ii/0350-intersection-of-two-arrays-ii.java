class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map =new HashMap<>();
       for(int i: nums1){
           if(map.containsKey(i)){
               map.put(i, map.get(i)+1);
           }else{
               map.put(i,1);
           }
       }
       List<Integer> result=new ArrayList<>();
       for (int i=0; i<nums2.length;i++){
           if(map.containsKey(nums2[i])&& map.get(nums2[i])>0){
               result.add(nums2[i]);
               map.put(nums2[i],map.get(nums2[i])-1);
           }
       }
       int[] ans=new int[result.size()];
       for(int i =0;i<ans.length;i++){
           ans[i]=result.get(i);
       }
       return ans ;
    }
}