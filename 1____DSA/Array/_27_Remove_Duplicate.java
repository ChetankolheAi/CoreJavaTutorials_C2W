public class _27_Remove_Duplicate {
    static void RemoveDuplicate(int arr[]){
        int lastElement = 0;
        int IndexInserted = 0;
        for(int i =0;i<arr.length;i++){
            if(lastElement!=arr[i]){
                lastElement = arr[i];
                arr[IndexInserted] = lastElement;
                IndexInserted++;
            }
        }
        for(int i=0;i<IndexInserted;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,4,4,4};
        RemoveDuplicate(arr);
    }
}
