public class _13_InterSection_Of_Array {
    static void Solve(int arr[] , int arr1[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i] == arr1[j]){
                    System.out.print(arr[i]+",");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={89,2,3,4};
        int arr1[] = {89,1,2};
        System.out.println("Element Common To Both are:- ");
        Solve(arr , arr1);
    }
}
