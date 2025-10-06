public class _41_Product_Of_Max_Nd_Min {

    static void Solve(int arr[] , int arr1[]){
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max = arr[i];
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<Min){
                Min = arr1[i];
            }
        }
        System.out.println(Max*Min);
    }
    public static void main(String[] args){
        int arr[]={5,7,9,3,6,2};
        int arr1[]={1,2,6,-1,0,9};
        Solve(arr , arr1);
    }
}