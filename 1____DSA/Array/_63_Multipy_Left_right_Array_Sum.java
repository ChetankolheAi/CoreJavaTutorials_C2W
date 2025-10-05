public class _63_Multipy_Left_right_Array_Sum {
    static int Solve(int arr[]){

        int Sum1 =0;
        int Sum2 =0;
        for(int i=0;i<arr.length;i++){
            if(i<arr.length/2)Sum1+=arr[i];
            else Sum2+=arr[i];
        }
        return Sum1*Sum2;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        System.out.println(Solve(arr));
    }
}
