// print all the subsequence of a given array
import java.util.*;
public class Subsequence {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split("");
        int n = arr.length;
        ArrayList<String> res = new ArrayList<>();
        solution(arr, 0, n, res);
    }
    static void solution(String[] arr,int i,int n,ArrayList<String> res){
        if(i == n){
            System.out.println(res);
            return;
        } 
        res.add(arr[i]);
        solution(arr,i+1,n,res);
        res.remove(arr[i]);
        solution(arr,i+1,n,res);
    }
}
