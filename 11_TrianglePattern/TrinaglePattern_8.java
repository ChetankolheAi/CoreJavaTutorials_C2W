import java.util.*;
class TrianglePattern{

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number Of Rows");
                int n = sc.nextInt();
                int num =1;
                for(int i=1;i<=n;i++){
			int x = num;
                        for(int j=n;j>=i;j--){
                                System.out.print(x+++" ");
                        }
                        num++;
                        System.out.println();
                }
        }

}
