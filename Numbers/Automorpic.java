import java.util.*;

class Automorphic{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number To Check Automorphic Or not");

		int num = sc.nextInt();
		int temp1 = num;
		if(num<10){
			
			num = num*num;
		
		}	
		int temp = num;
		int rev =0;
		boolean flag = false;		
		while(num>0){
	
			int rem = num%10;
			num/=10;
			rev = (rev*10)+rem;

			int num2 = rev;
			int rev2 =0;
			while(num2>0){

				int rem2 = num2%10;
				num2/=10;
				rev2 = (rev2*10)+rem2;
					

			}

			if(rev2*rev2 == temp){

			
				System.out.println("The Given Number "+temp1+" is Automorphic");
				System.out.println();
				flag = true;
				break;

			}

		}
		if(flag == false){

			System.out.println("The Given Number "+temp1+" is Not Automorphic");
			System.out.println();

		}
	}
}
