public class _66_Find_Peak {
    static int Peak(int arr[]){
        int Max = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>Max){
                Max = i;
            }
        }
        return Max;
    }
    public static void main(String[] args) {
        int arr[]= {10,20,15,2,23,90,67};
        System.out.println("Peak in Given Arrray is :- "+Peak(arr));
    }
}
