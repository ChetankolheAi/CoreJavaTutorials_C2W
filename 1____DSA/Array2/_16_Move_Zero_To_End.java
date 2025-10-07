
public class _16_Move_Zero_To_End{
    static void Solve(int arr[]){
        int SwappingIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[SwappingIndex];
                arr[SwappingIndex] = temp;
                SwappingIndex++;
            }
        }
        for(int i:arr){
            System.out.print(i+",");
        }
    }
    public static void main(String[] args) {
        int arr[] ={0,0,4,5,7,0,9};
        Solve(arr);
    }
}
