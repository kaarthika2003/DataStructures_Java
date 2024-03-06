import java.util.*;
public class SubSumDup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n  ; i++){
            arr[i] = in.nextInt();
        }
        int sum = in.nextInt();
        HashSet<List<Integer>> set = new HashSet<>();
        solution(arr, n, 0, set, 0, sum);
        System.out.println(set);
    }
    static void solution(int[] arr,int n,int i,HashSet<List<Integer>> set,int sum,int s){
        ArrayList<Integer> al = new ArrayList<>();
        if(i == n){
            if(sum == s){
                set.add(al);
            }
            return;
        }
        sum += arr[i];
        al.add(arr[i]);
        solution(arr, n, i+1, set, sum, s);
        sum -= arr[i];
        int ind = al.indexOf(arr[i]);
        al.remove(ind);
        solution(arr, n, i+1, set, sum, s);
    }
}
