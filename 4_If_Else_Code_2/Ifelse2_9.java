





import java.util.*;
class Ifelse2_9{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Side 1");
		int S1 = sc.nextInt();
		
		System.out.println("Enter the Side 2");
		int S2 = sc.nextInt();

		System.out.println("Enter the Side 3");
		int S3  = sc.nextInt();


		if(((S1*S1)+(S2*S2) == (S3*S3)) ||((S1*S1)+(S3*S3) == (S2*S2)) ||((S3*S3)+(S2*S2) == (S1*S1))){

		System.out.println("Pythagorean triplet");

		}
		else {

			System.out.println("It is Not Pythagorean Triplet");
		}
	}


}
