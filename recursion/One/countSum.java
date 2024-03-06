// count number of subsequence where sum is k
public class countSum {
    public static void main(String[] args){
        int[] arr = {6,3,5,4,1,10};
        int n = arr.length;
        int s = 10;
        //ArrayList<Integer> al = new ArrayList<>();
        System.out.println(solution(arr, n, 0,0,s));
    }
    static int solution(int[] arr,int n,int i,int sum,int s){
        if(i == n){
            if(sum == s){
                //System.out.println(al);
                return 1;
            }
            return 0;
        }
        sum += arr[i];
        //al.add(arr[i]);
        int l = solution(arr, n, i+1, sum, s);
        sum -= arr[i];
        //int ind = al.indexOf(arr[i]);
        //al.remove(ind);
        int r = solution(arr, n, i+1, sum, s);
        return l+r;
    }
}
