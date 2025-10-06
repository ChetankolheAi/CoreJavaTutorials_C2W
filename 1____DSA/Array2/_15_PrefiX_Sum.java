import java.util.Scanner;

public class _15_PrefiX_Sum {
    static void Solve(int arr[] , int Q){
            int Prefix = 0;
            for(int i=0;i<arr.length;i++){
                Prefix += arr[i];
                arr[i] = Prefix;
            }
          
            for(int i=0;i<Q;i++){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Start Index");
                int S = sc.nextInt();
                System.out.println("Enter Last Index");
                int E = sc.nextInt();

                if(S<0 || E>arr.length) System.out.println("Invalid Index");
                else if(S==0)System.out.println("Sum Of Element is: " +arr[E]);
                else System.out.println("Sum Of Element is: "+ (arr[E]-arr[S-1]));
            }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int Q = 3;
        Solve(arr, Q);
    }
}
