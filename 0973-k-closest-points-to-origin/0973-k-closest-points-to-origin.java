class Solution {
    public class Point implements Comparable<Point>{
        int x;
        int y;
        int dist;
        int i;
        public Point(int x, int y, int dist, int i){
            this.x=x;
            this.y=y;
            this.dist=dist;
            this.i=i;
        }
        @Override
        public int compareTo(Point p2){
            return this.dist-p2.dist; // Ascending Order Sorting
        }

    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int dist=(points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
            pq.add(new Point(points[i][0],points[i][1],dist,i));
        }
        int[][] ans=new int[k][];
        for(int i =0; i<k ;i++){
            Point point=pq.remove();
            ans[i]=new int[]{points[point.i][0],points[point.i][1]};
        }
        return ans;
    }
}