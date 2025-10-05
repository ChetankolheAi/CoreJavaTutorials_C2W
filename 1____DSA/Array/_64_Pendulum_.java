import java.util.Arrays;

public class _64_Pendulum_ {
    static void Arrange(int arr[] ,int Result[]){
        int MidElement = arr.length/2;
        if(arr.length%2==0){
            MidElement = (arr.length-1)/2;
        }
        Result[MidElement] = arr[0];
        int i=MidElement-1;
        int j=MidElement+1;
        for(int g=1;g<arr.length;g++){
            if(g%2==0){
                Result[i] = arr[g];
                i--;
            }
            else{
                Result[j] = arr[g];
                j++;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] ={31,11,12,14,5};
        int Result[] = new int[arr.length];
        Arrays.sort(arr);
        Arrange(arr ,Result);
        for(int i:Result){
            System.out.print(i+",");
        }
        
    }
}
