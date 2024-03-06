public class one{
    public static void main(String[] args) {
        int n = 5;
       // num1ToN(1,n);
       //numNto1(n, n);
       //back1ToN(n, n);
       System.out.println(fibo(n));
    }
    static void num1ToN(int i,int n){
        if(i > n)
            return;
        System.out.println(i);
        num1ToN(i+1, n);
    }

    static void numNto1(int i,int n){
        if(i < 1)
            return;
        System.out.println(i);
        numNto1(i-1, n);
    }

    static void back1ToN(int i,int n){
        if(i < 1)
        return;
        back1ToN(i-1, n);
        System.out.println(i);
    }

    static int fibo(int n){
        if(n <= 1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}