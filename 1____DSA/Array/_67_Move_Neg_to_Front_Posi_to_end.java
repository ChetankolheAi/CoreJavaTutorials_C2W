public class _67_Move_Neg_to_Front_Posi_to_end {
    static void Move(int arr[]){
        int SwappingIndex =0;
        for(int i=0;i<arr.length;i++){
           
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[SwappingIndex];
                arr[SwappingIndex] = temp;
                SwappingIndex ++;

            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={-12,11,-13,-5,6,-7,5,-3,-6};
        Move(arr);
        for(int i:arr){
            System.out.print(i+",");
        }
    }
}
