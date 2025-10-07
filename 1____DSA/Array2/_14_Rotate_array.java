public class _14_Rotate_array {
    static void Solve(int arr[] , int D){
        int i =0;
        int num = 0;
        while(i<D){
            num = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = num;
            i++;
        }
        System.out.println("Rotated Array is:- ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+",");
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,8,9};
        int D = 5;
        Solve(arr , D);
    }
}
