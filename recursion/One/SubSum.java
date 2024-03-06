import java.util.ArrayList;
// print any one subsequence with sum k
public class SubSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = arr.length;
        int s = 5;
        ArrayList<Integer> res = new ArrayList<>();
        solution(arr,n,0,res,0,s);
    }
    static boolean solution(int[] arr,int n,int i,ArrayList<Integer> res,int sum,int s){
        if(i >= n){
            if(sum == s){
                System.out.println(res);
                return true;
            }
            return false;
        }
        res.add(arr[i]);
        sum += arr[i];
        if(solution(arr, n, i+1, res, sum,s) == true){
            return true;
        }
        int ind = res.indexOf(arr[i]);
        res.remove(ind);
        sum -= arr[i];
        if(solution(arr, n, i+1, res, sum, s)){
            return true;
        }
        return false;
    }
}
