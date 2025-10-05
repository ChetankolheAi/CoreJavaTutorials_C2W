public class _40_Max_Odd_Sum {

    static int maxOddSum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;


        for (int mask = 1; mask < (1 << n); mask++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += arr[i];
                }
            }
            if (sum % 2 != 0) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return (maxSum == Integer.MIN_VALUE) ? 0 : maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {4, -3, 3, -5};
        System.out.println( maxOddSum(arr)); 
    }
}
