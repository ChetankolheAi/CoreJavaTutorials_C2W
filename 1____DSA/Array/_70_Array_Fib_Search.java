public class _70_Array_Fib_Search {

    static boolean isPerfectSquare(long n) {
        long s = (long)Math.sqrt(n);
        return s * s == n;
    }

    static boolean isFibonacci(long x) {
        return isPerfectSquare(5 * x * x + 4) || isPerfectSquare(5 * x * x - 4);
    }
    public static void main(String[] args) {
        int Count =0;
        int arr[] ={4,2,8,5,20,1,40,13,23};
        for(int i=0;i<arr.length;i++){
            if(isFibonacci(arr[i]))Count++;
        }
        System.out.println("Count Of Fibonacci Number are :- "+Count);
    }
}
