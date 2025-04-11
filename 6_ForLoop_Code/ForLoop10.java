




import java.util.*;
class ForLoop10{


        public static void main(String [] args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Range To Find Count Of Odd Numbers ");
                int n = sc.nextInt();
                int count =  0;
                for(int i=0;i<=n;i++){
                        if(i%2!=0){
                                count++;
                        }
                }
                System.out.println("Count Of Odd Number is :- "+count);

        }
}
