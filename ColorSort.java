// Used Dutch National Flag Algorithm i.e, DNF
// Refer this page for clarity https://loopccew.medium.com/dutch-national-flag-algorithm-91c469d9182b

class Solution {
    public void sortColors(int[] nums) {
        int size=nums.length;

        int low=0, mid=0, high=size-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }

    }
}
