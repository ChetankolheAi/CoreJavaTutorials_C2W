import java.util.*;
class TrianglePattern{

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number Of Rows");
                int n = sc.nextInt();
                int num =n;
                for(int i=1;i<=n;i++){
                        for(int j=0;j<i;j++){
                                System.out.print(num+" ");
                        	num+=n;
			}
			num=n;
                        System.out.println();
                }
        }

}
