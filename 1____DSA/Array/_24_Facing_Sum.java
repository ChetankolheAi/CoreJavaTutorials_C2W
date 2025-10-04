public class _24_Facing_Sum {
    static int FacingSun(int arr[]){
        int CrrtMax = Integer.MIN_VALUE;
        int count =0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>CrrtMax){
                count++;
                CrrtMax = arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,6};
        System.out.println("Count Of Building Which can see the Sun Shine is :-"+FacingSun(arr));
    }
}
