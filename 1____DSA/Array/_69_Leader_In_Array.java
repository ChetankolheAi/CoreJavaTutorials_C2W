public class _69_Leader_In_Array {
    static void LeaderInArray(int arr[]){
        int arr2[]= new int[arr.length];
        int Max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>Max){
                Max= arr[i];
            }
            arr2[i] = Max;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr2[i]){
                System.out.println(arr[i]);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        LeaderInArray(arr);
    }
}
//TC -O(n)
//SC -O(n)