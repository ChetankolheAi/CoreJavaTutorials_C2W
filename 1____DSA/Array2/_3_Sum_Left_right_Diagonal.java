

public class _3_Sum_Left_right_Diagonal {
    static void Solve(int arr[][] , int row , int col){

        int SumRight = 0;
        int SumLeft = 0;
        int i = 0;
        int j =0;
        while(i!=row &&  j!=row){
            SumLeft += arr[i][j];
            i++;
            j++;
        }
        i=0;
        j=row-1;
        while(i!=row && j!=-1){
            SumRight += arr[i][j];
            i++;
            j--;
        }
        System.out.println("Left Diagonal Sum:"+SumLeft);
        System.out.println("Right Diagonal  Sum:"+SumRight);
    }
    public static void main(String[] args) {
        
   
    int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
    int row = 3;
    int col = 3;
    Solve(arr , row , col);
    }
}
