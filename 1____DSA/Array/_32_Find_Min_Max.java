public class _32_Find_Min_Max {
    static void MaxMin(int arr[]){
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max = arr[i];

            }
            if(arr[i]<Min){
                Min = arr[i];
            }
        }
        System.out.println("Max: "+Max);
        System.out.println("Min: "+Min);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,56,-1,78,2,-9,787,-20};
        MaxMin(arr);
    }
}

