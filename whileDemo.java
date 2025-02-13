
import java.util.*;
class whileDemo {
    
    public static void main(String [] args){

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int input = sc1.nextInt();
        int i = 1;

        System.out.println("Printing All Number From 1 to "+ input);
        while(i<=input){

            System.out.println(i);
            i++;
        }
        
    }
}
