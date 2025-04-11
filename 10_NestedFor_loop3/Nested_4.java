import java.util.*;
class Nested{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Rows");
                int n = sc.nextInt();

                int num = 1 ;
                for(int i=0;i<n;i++){
                        for(int j=1;j<=n;j++){
				if(j%2==0){

                                	System.out.print(num*num+" ");
				}
				else{
					System.out.print(num*num*num+" ");
				
				}
				num++;

                        }
                        System.out.println();                                                                                                                               }
        }
}
