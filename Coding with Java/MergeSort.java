//Merge Sort algo
import java.util.*;

public class MergeSort {
    public static void MS(int arr[], int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        MS(arr, low, mid); //Recursive call for first half portion till mid
        MS(arr, mid + 1, high); //Recursive call for second half portion from mid+1
        merge(arr, low, mid, high); //Used to merge those two subarrays
    }

    public static void merge(int nums[], int l, int m, int h) {
        List<Integer> temp = new ArrayList<>();
        int left = l;
        int right = m + 1;
        //Checks for corresponding element in both subarrays
        while (left <= m && right <= h) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }

        }
        //Works for any remaining elements in Left subarray
        while (left <= m) {
            temp.add(nums[left]);
            left++;
        }
        //Works for any remaining elements in right subarray
        while (right <= h) {
            temp.add(nums[right]);
            right++;
        }
        //Copying elements from temp to nums using l+1 as direct index usage causes overwriting
        for (int i = 0; i < temp.size(); i++) {
            nums[l + i] = temp.get(i);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 9, 8, 14, 12, 5, 4, 3 };
        MS(arr, 0, (arr.length - 1));
        for (int num : arr)
            System.out.print(num + " ");
    }
}
