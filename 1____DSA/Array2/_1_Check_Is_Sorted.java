
public class _1_Check_Is_Sorted {
    static boolean Solve(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] ={90,80,10,20,30};
        boolean ans = Solve(arr);
        if(ans)System.out.println("Array Sorted");
        else System.out.println("Not Sorted");
       
    }
}
