




import java.util.*;
class WhileLoop3{


        public static void main(String [] args){

                Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Range To Print Number Divisible By 4 Or 7");
		System.out.print("From :- ");
		int From = sc.nextInt();
		System.out.print("To :- ");
                int To = sc.nextInt();

		int i = From;
		while(i<=To){
			if(i%4==0 || i%7==0)
			System.out.print(i+",");

			i++;
		}
		System.out.println();



	}
}
