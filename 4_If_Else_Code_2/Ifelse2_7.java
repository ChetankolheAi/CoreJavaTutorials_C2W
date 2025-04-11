





import java.util.*;
class Ifelse2_7{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Selling Price");
		int SP = sc.nextInt();
		
		
		System.out.println("Enter Cost Price");
		int CP = sc.nextInt();

		if(SP > CP){

			System.out.println("Profit of :- "+(SP-CP));

		}
		else if(CP > SP){

			 System.out.println("Loss of :- "+(CP-SP));
			     
		}
		else{


			 System.out.println("SP and CP are Equal // NO Profit //No Loss");

		}
	}


}
