public class _19_Element_With_Left_Side_Smaller_ {
    static int  Find(int arr[]){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i]&&arr[i+1]>arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={8,9,12};
        System.out.println(Find(arr));
    }
}
