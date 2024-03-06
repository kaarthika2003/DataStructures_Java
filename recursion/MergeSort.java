import java.util.*;
public class MergeSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr,int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low+high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> al = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                al.add(arr[left]);
                left++;
            }
            else{
                al.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            al.add(arr[left]);
            left++;
        }
        while(right <= high){
            al.add(arr[right]);
            right++;
        }
        for(int i = low ; i <= high ; i++){
            arr[i] = al.get(i - low);
        }
    }
}
