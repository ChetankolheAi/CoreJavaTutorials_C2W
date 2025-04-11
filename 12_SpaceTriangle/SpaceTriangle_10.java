

import java.util.*;
class SpaceTriangle{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter The Row Count ");
                int row = sc.nextInt();
                

                for(int i=1;i<=row;i++){
                         char ch = (char)(64+row);

                        for(int j=1;j<=row;j++){

		             	if(j<=i-1){
					
					System.out.print("  ");
             			}
           			else{
					
					System.out.print(ch--+" ");


                                }
                        }
                        System.out.println();
                }

        }
}
