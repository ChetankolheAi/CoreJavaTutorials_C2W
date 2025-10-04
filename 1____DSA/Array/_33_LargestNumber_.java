public class _33_LargestNumber_{
     static void MaxValue(int arr[]){
        int Max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max = arr[i];

            }
        
        }
        System.out.println("Max: "+Max);


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,56,-1,78,2,-9,787,-20};
        MaxValue(arr);
    }
}