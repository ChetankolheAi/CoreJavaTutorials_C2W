public class _23_Three_Great_Candidate {
    static int ThreeGreates(int arr[]){
        int Max1 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(Max1<arr[i]){
                Max1 = arr[i];
            }
        }
        int Max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(Max1>arr[i] && arr[i]>Max2){
                Max2 = arr[i];
            }
        }
        int Max3 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(Max1>arr[i] && arr[i]<Max2 && arr[i]>Max3){
                Max3 = arr[i];
            }
        }
        return Max1*Max2*Max3;
    }
    public static void main(String[] args) {
        int arr[]= {10,3,5,6,20};
        System.out.println("Maximum Collective Ability:- "+ThreeGreates(arr));
    }
}
