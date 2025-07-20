// Recursive 2 pointers l and r approach

// public class ReverseArrElem {
//     public static int[] Reverse(int l, int r, int arr[]) {
//         if (l >= r) {
//             return arr;
//         }
//         int temp;
//         temp = arr[l];
//         arr[l] = arr[r];
//         arr[r] = temp;
//         return Reverse(l + 1, r - 1, arr);
//     }

//     public static void main(String[] args) {
//         int[] array = { 5, 4, 6, 9, 2 };
//         int[] res = Reverse(0, (array.length - 1), array);
//         for (int i : res) {
//             System.out.print(i + " ");
//         }

//     }
// }

// Recursive 1 pointer i and n(length) approach
public class ReverseArrElem{
    public static int[] reverse_arr(int i, int n, int arr[]){
        if(i >= n/2){
            return arr;
        }
        int temp;
        temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        return reverse_arr(i+1, n, arr);
    }
    public static void main(String[] args){
        int[] arr = {7,5,6,3,6,9};
        int[] res = reverse_arr(0, arr.length, arr);
        for(int i: res){
            System.out.print(i+" ");
        }
    }
}
