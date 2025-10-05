public class _52_Find_Odd_Occurance {
     static int findOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
       
            if (count % 2 != 0) {
                return arr[i];
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        System.out.println("Number occurring odd times: " + findOdd(arr));
     
    }
}
