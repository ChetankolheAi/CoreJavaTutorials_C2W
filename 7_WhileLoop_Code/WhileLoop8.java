




import java.util.*;
class WhileLoop8{


        public static void main(String [] args){

                Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Range To Print Sum Of All Number In Given Range");
		System.out.print("From :- ");
		int From = sc.nextInt();
		System.out.print("To :- ");
                int To = sc.nextInt();

		int i = From;
		int sum = 0;
		while(i<=To){
			sum = sum+i;
			i++;
		}
		System.out.println("Sum Of "+From+" To "+To+" is:- "+sum);



	}
}
