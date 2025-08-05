class RecursiveInsertionSort{
    static void ISort(int[] nums,int i,int n){
        if(i==n) return;
        int j=i;
        while(j>0 && nums[j-1]>nums[j]){
            int temp=nums[j-1];
            nums[j-1]=nums[j];
            nums[j]=temp;
            j--;
        }
        ISort(nums,i+1,n); //Just external i loop is replaced with a recursive logic
       
    }
    public static void main(String[] args){
        int[] arr={86,4,34,5,67};
        ISort(arr,0,arr.length);
        for(int elem:arr) System.out.print(elem+" ");
    }
}
