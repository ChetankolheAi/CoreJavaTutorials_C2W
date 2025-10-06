

public class _7_Repeating_Index {
    static int Solve(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j)return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,9,4,3,4,5,6};
        System.out.println("Index is :" + Solve(arr));
    }
}
