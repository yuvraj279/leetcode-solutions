class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    HashSet<Integer> set1=new HashSet<>();
    HashSet<Integer> set2=new HashSet<>();
    HashSet<Integer> set3=new HashSet<>();
    HashSet<Integer> set4=new HashSet<>();
    List<List<Integer>> result=new ArrayList<>();
    for(int i: nums1){
        set1.add(i);
    }
    for(int i: nums2){
        set2.add(i);
    }
    for(int i=0; i<nums1.length;i++){
        if(!set2.contains(nums1[i])){
            set3.add(nums1[i]);
        }
    }
    for(int i=0;i<nums2.length;i++){
        if(!set1.contains(nums2[i])){
            set4.add(nums2[i]);
        }
    }
    result.add(new ArrayList<>(set3));
    result.add(new ArrayList<>(set4));
    return result;
    }
}