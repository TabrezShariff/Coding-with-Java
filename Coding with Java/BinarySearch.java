//Binary Search on static array
class BinarySearch {
    public static int binSearch(int nums[],int elem){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==elem) return mid;
            else if(nums[mid]>elem) r=mid-1;
            else l=mid+1;
        }
        return -1;
        
        
    }
    public static void main(String[] args) {
        int[] nums={2,3,4,5,6,7,8};
        int value=8;
        int result=binSearch(nums,value);
        System.out.println(result);
        
    }
}
