class Solution {
    public int search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
      return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
	    int mid=start+(end-start)/2;
	    if(target==arr[mid]){
	        return mid;
	    }
	    if(arr[start]<=arr[mid]){
	        if((target<=arr[mid])&&(target>=arr[start])){
	            end=mid-1;
	            return binarysearch(arr,target,start,end);
	        }else{
	            start=mid+1;
	            return binarysearch(arr,target,start,end);
	        }
	    }
	    if(arr[mid]<=arr[end]){
	        if((target>=arr[mid])&&(target<=arr[end])){
	            start=mid+1;
	            return binarysearch(arr,target,start,end);
	        }else{
	            end=mid-1;
	            return binarysearch(arr,target,start,end);
	        }
	    }
        return -1;
	}
}