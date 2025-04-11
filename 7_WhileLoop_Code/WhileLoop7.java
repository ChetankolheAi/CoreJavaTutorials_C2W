




import java.util.*;
class WhileLoop7{


        public static void main(String [] args){

                Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Range To Print Cube To First N Natural Number Enter N");
		int n = sc.nextInt();
	

		int i = 0;
		while(i<=n){
			System.out.print(((i*i)*i)+",");

			i++;
		}
		System.out.println();



	}
}
