class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        int count=0;
        if(flowerbed.length==1){
            if(flowerbed[i]==0){
                count++;
                i++;
            }
        }

        while(i<flowerbed.length){
            
            if(flowerbed[i]==1){
                // -leaves it next also as no need to check
                i++;
            }else{
                if(i==0 && flowerbed[i+1]==0){
                    count++;
                    flowerbed[i]=1;
                    i++;
                }
                if(i>0 && i<flowerbed.length-1 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    count++;
                    flowerbed[i]=1;
                    i++;
                }
                else if(i==flowerbed.length-1 && flowerbed[i-1]==0){
                    flowerbed[i]=1;
                    count++;
                    i++;
                }
                 if (count >= n) {
                     return true;
                }
            }
            i++;
        }
        return count>=n;
    }
}