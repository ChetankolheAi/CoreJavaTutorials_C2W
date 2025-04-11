




import java.util.*;
class WhileLoop4{


        public static void main(String [] args){

                Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Range To Print Squares of all Number in Reverse Order");
		
                int n = sc.nextInt();

		int i = n;
		while(i!=0){
			System.out.print(i*i+",");

		
			i--;
		}
		System.out.println();



	}
}
