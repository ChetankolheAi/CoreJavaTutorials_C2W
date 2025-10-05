public class _60_FindClosest {

    static int findClosest(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = n - 1;


        while (left < right - 1) { 
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) return arr[mid];
            else if (arr[mid] < k) left = mid;
            else right = mid;
        }

        // After loop, closest is between arr[left] and arr[right]
        if (Math.abs(arr[left] - k) <= Math.abs(arr[right] - k))
            return arr[left];
        else
            return arr[right];
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 12, 14};
        int k = 11;

        int closest = findClosest(arr, k);
        System.out.println("Closest number to " + k + " is: " + closest);
    }
}
