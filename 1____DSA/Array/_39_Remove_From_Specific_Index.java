public class _39_Remove_From_Specific_Index {
    static void Remove(int arr[] , int removeIndex){

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == removeIndex) continue; // skiping removed element
            newArr[k++] = arr[i];
        }

        for (int n : newArr) System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int removeIndex = 3;
        Remove(arr , removeIndex);
    }
}
