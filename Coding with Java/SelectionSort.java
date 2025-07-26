//Selection sort
import java.util.*;
class SelectionSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        sortKnow(arr, arr.length);
    }
    public static void sortKnow(int[] arr,int n){
        for(int i=0; i<n-2; i++){
            int min = i;
            for(int j=i; j<n-1; j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int elem:arr) System.err.print(elem+" ");
    }
}
