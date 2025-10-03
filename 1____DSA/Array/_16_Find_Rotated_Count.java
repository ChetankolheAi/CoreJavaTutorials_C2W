public class _16_Find_Rotated_Count {
    static int findRotationCount(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            if (arr[left] <= arr[right]) return left;

            int mid = left + (right - left) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            } else if (arr[mid] >= arr[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr1[] = {4, 5, 6, 1, 2, 3};

        System.out.println(findRotationCount(arr1));
    
    }
}
 