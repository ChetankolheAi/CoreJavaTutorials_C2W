
public class _2_Transition_Point {
    static int Solve(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={0,0,0,1,1};
        int ans = Solve(arr);
        if(ans==-1)System.out.println("No Transition Point");
        else System.out.println("Transition Point is :"+ans);
    }
}
