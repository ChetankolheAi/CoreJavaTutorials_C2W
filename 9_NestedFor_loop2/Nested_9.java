
import java.util.*;
class Nested{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter The Number Of Rows");
                int n = sc.nextInt();
                int num = 1;
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
				
				if(j%2!=0){
					System.out.print(num+" ");
				}
				else{

                        	        System.out.print(num*num+" ");
				}
                                num++;

                        }
                        System.out.println();

                }
        }
}

