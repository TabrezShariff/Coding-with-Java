public class RecBubbleSort {
    public static void RBSort(int nums[], int n) {
        if (n == 1)
            return;
        for (int j = 0; j <= n - 2; j++) {
            if (nums[j] > nums[j + 1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }

        }

        RBSort(nums, n - 1); //Jusr replaced outer loop who adjusts the range from last, to recurisve approach
    }

    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 4, 3, 2, 13, 45 };
        RBSort(arr, arr.length - 1);
        for (int elem : arr)
            System.out.print(elem + " ");
    }
}
