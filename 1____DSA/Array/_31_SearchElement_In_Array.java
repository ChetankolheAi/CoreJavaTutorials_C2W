public class _31_SearchElement_In_Array {
    static int FindNumber(int arr[] , int k){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int k =4;
        System.out.println(FindNumber(arr , k));
    }
}
