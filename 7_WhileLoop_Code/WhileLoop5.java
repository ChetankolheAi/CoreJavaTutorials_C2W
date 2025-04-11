



import java.util.*;
class WhileLoop5{


        public static void main(String [] args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter days ");
                int n = sc.nextInt();

                int i =  n;
                while(i>=0){

                    if(i!=0){

                        System.out.println(i+" Days Remaining");                     }
                     else{
                        System.out.println(i+" Days Remainig Assignment Overdue");
                     }
                     i--;
                }
        }


}
