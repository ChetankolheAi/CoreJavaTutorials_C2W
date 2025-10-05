public class _51_First_Element_That_Occur_k_time {
     static int firstElementKTimes(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count == k) {
                return arr[i];
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;
        System.out.println("First element that occurs " + k + " times: " + firstElementKTimes(arr, k));
        
    }
}
