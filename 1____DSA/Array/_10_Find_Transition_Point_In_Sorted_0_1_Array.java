public class _10_Find_Transition_Point_In_Sorted_0_1_Array {

    //Find transition Point;
    static int FindTransitionPoint(int arr[]){
        int left =0;
        int right=arr.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(arr[mid]==0){
                left = mid+1;
            }
            else if(arr[mid]==1){
                right = mid;
            }
        }
        if(left>arr.length){
            return -1;
        }
        else if(arr[left]==1){
            return left;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[] = {0,0,0,0,0,0,0};   
    int arr2[] = {1,1,1,1,1,1};        
    int arr3[] = {0,0,0,1,1,1,1};       
  

    System.out.println(FindTransitionPoint(arr1)); // -1
    System.out.println(FindTransitionPoint(arr2)); // 0
    System.out.println(FindTransitionPoint(arr3)); // 3


    }
}
