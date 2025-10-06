public class _74_Maximum_I_J_ {
    static int Solve(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]<=arr[j]){
                return j-i;
            }
            i++;
            j--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={34,8,10,3,2,80,30,33,1};
       System.out.println(Solve(arr)); 
    }
}
