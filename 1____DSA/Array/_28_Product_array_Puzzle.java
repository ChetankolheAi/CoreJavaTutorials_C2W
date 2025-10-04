public class _28_Product_array_Puzzle {
    static void ProductArrayPuzzle(int arr[]) {
        int n = arr.length;
        int result[] = new int[n];
        int zeroCount = 0;
        int product = 1;

        // Step 1: Compute product of all non-zero elements & count zeros
        for (int num : arr) {
            if (num != 0) product *= num;
            else zeroCount++;
        }

        // Step 2: Build result array
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                result[i] = 0; // More than one zero → all zeros
            } else if (zeroCount == 1) {
                result[i] = (arr[i] == 0) ? product : 0;
            } else {
                result[i] = product / arr[i];
            }
        }

        // Step 3: Print result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 0};
        ProductArrayPuzzle(arr);
    }
}
