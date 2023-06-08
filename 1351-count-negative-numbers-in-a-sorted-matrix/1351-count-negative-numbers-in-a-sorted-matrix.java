class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        int r=0;
        while (r< grid.length ){
            for (int c = grid[r].length-1; c>=0 ; c--) {
                if (grid[r][c]<0){
                    count++;
                }
            }
            r++;
            }
        return count;
    }
}