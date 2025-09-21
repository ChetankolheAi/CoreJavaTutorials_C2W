
//Write A Program to iterate over a 2D array , and print the element whose cube is Odd number   

public class D2_array {
    static void PrintNumbers(int arr[][] , int row , int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]*arr[i][j]*arr[i][j]%2!=0){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    public static void main(String[] args)
    {   
        int arr[][]={{10,20,30,40},{11,22,33,44},{12,24,36,48}};
        PrintNumbers(arr , 3 ,4);
    }
}
