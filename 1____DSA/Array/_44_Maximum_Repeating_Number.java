public class _44_Maximum_Repeating_Number{
    static int MaxRepeating(int arr[] , int k){
        int Result[] = new int[k];
        for(int i=0;i<arr.length;i++){
            Result[arr[i]] += 1;
        }
        int Max = Integer.MIN_VALUE;
        int Ans = 0;
        for(int i=0;i<Result.length;i++){
            if(Max < Result[i]){
                Result[i] = Max;
                Ans = i;
            }
        }
        return Ans;
    }
    public static void main(String[] args) {
        int arr[] ={3,3,1,2};
        System.out.println(MaxRepeating(arr , 4));
    }
}