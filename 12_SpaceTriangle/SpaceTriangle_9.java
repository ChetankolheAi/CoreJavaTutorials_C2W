

import java.util.*;
class SpaceTriangle{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Row Count ");
                int row = sc.nextInt();
                boolean odd = false;
                if(row%2==1){

                        odd = true;
                }


                for(int i=1;i<=row;i++){
                         char ch = (char)(64+i);

                        for(int j=1;j<=row;j++){

                                if(j<=i-1){

                                        if(odd){

                                                if(j%2==1){

                                                         System.out.print("  ");
                                                }
                                                else{
                                                         System.out.print("   ");

                                                }

                                        }
                                        else{
                                                if(j%2==1){

                                                        System.out.print("   ");
                                                }
                                                else{
                                                        System.out.print("  ");
                                                }
                                        }

                                }
                                else{

                                        if(odd){
                                                if(j%2==1){
                                                         System.out.print(ch+++" ");
                                                }
                                                else{
                                                         System.out.print((int)ch+++" ");

                                                }

                                        }
                                        else{
                                                if(j%2==1){

                                                        System.out.print((int)ch+++" ");
                                                }
                                                else{
                                                        System.out.print(ch+++" ");
                                                }
                                        }

                                }
                        }
                        System.out.println();
                }

        }
}
