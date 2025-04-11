




import java.util.*;
class WhileLoop9{


        public static void main(String [] args){

                Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Range To Print Sum of All Odd Numbers In Given Range");
		System.out.print("From :- ");
		int From = sc.nextInt();
		System.out.print("To :- ");
                int To = sc.nextInt();

		int i = From;
		int sum =0;
		while(i<=To){
			if(i%2!=0)
			{
				sum = sum+i;
			}

			i++;
		}
		System.out.println("Sum of Odd Numberd From Range "+From+" to "+To+" is:- "+sum);



	}
}
