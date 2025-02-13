

import java.util.*;
class whileDemo {
    
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int input = sc.nextInt();
        int i = 1;

        System.out.println("Printing All Number From 1 to "+ input);
        while(i<=input){

            System.out.println(i);
            i++;
        }
        
    }
}
