public class _38_Even_Occuring_element {
      static void findEvenOccurring(int arr[]) {
        int freq[] = new int[64];  // Fixed size → O(1) space

     
        for (int num : arr) {
            freq[num]++;
        }
        System.out.print("Even occurring element:   ");
        for (int i = 0; i < 64; i++) {
            if (freq[i] != 0 && freq[i] % 2 == 0) {
                
                System.out.print(i+",");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 63, 63};
        findEvenOccurring(arr);
    }
}
