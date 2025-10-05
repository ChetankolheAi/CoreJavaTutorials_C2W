public class _68_Immediate_Smaller {
    static void Immediate(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                arr[i] = arr[i+1];
            }
            else{
                arr[i] = -1;
            }
        }
        arr[arr.length-1] = -1;
    }
    public static void main(String[] args) {
        int arr[]={4,2,1,5,3};
        Immediate(arr);
        for(int i:arr){
            System.out.print(i+",");
        }
    }
}
