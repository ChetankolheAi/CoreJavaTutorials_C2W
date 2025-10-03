public class _18_Move_All_Zeros_To_End {
    static void MoveZerosTOEnd(int arr[]) {
        int j = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 0, 3, 0, 4, 5};
        MoveZerosTOEnd(arr);
    }
}
