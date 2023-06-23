class Solution {
    public class Pair implements Comparable<Pair>{
        int num;
        int index;
        public Pair(int num, int index){
            this.num=num;
            this.index=index;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.num-this.num; // Sort in descending Order
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        int[] res=new int[nums.length-k+1];
        for(int i=0; i<k; i++){
            pq.add(new Pair(nums[i],i));
        }
        res[0]=pq.peek().num;
        for(int i=k; i<nums.length ;i++){
            while(pq.size()>0 && pq.peek().index<= (i-k)){
                pq.remove();
            }
            pq.add(new Pair(nums[i],i));
            res[i-k+1]=pq.peek().num;
        }
        return res;
    }
}