import java.util.HashSet;

public class _15_Union_Of_Two_Sorted_Array {
    static void FindUnion(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);
        for (int num : set) System.out.print(num + " ");
    }

    public static void main(String[] args) {
        int arr1[] = {89, 24, 75, 11, 23};
        int arr2[] = {89, 2, 4};
        FindUnion(arr1, arr2);
    }
}
