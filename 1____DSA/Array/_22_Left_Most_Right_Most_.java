public class _22_Left_Most_Right_Most_ {
    static void  FindLMAndRM(int arr[] , int X){
        int left = 0;
        int right = arr.length-1;
        //LastIndex Finding
        while(left<right){
            int mid = left + (right - left) / 2;

            if(arr[mid]>X){
                right = mid;
            }
            else if(arr[mid]<=X){
                left = mid+1;
            }
        }
        int left1 = 0;
        int right1 = arr.length-1;
        //FirstIndex Finding
        while(left1<right1){
            int mid = left1 + (right1 - left1) / 2;

            if(arr[mid]>=X){
                right1 = mid;
            }
            else if(arr[mid]<X){
                left1 = mid+1;
            }
        }
        System.out.println("LeftMost Index:-"+left1);
        System.out.println("RightMost Index:-"+(left-1));
     
    }
    public static void main(String[] args) {
        int X = 5;
        int arr[] ={1,3,5,5,67,123,125};
        FindLMAndRM(arr ,X);
    }
}