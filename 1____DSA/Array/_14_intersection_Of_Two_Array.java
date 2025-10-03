import java.util.*;

public class _14_intersection_Of_Two_Array {
    static void FindIntersection(int arr1[], int arr2[]) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int count=0;
        for (int num : arr2) {
            map.put(num, true);
        }
        for (int num : arr1) {
            if (map.containsKey(num)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr1[] = {89, 2, 75, 11, 23};
        int arr2[] = {89, 2, 4};
        FindIntersection(arr1, arr2);
    }
}
