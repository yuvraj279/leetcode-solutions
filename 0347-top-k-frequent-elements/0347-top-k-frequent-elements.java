class Solution {
     public static class Pair implements Comparable<Pair>{
        int num;
        int count;

        public Pair(int num, int count) {
            this.num = num;
            this.count = count;
        }
        public int compareTo(Pair p2){
            return p2.count-this.count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        Integer [] key=map.keySet().toArray(new Integer[0]);
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for (int i = 0; i < key.length; i++) {
            pq.add(new Pair(key[i],map.get(key[i])));
        }
        int ans[]=new int[k];
        for (int i = 0; i < k; i++) {
            ans[i]=pq.remove().num;
        }
        return ans;
    }
}