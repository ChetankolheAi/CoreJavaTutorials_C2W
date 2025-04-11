





import java.util.*;
class Ifelse2_8{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Percentage");
		int Percent = sc.nextInt();
		
		if(Percent>85 && Percent<=100){

			System.out.println( "Passed: First Class With Distinction");

		
		}
		 else if(Percent>100){

                             System.out.println("Invalid Percentage");

                }
		else if(Percent<=85 && Percent>75){

			     System.out.println("Passed: First Class");
			     
		}
		else if(Percent<=75 && Percent>65){

                             System.out.println("Second Class");
                }
		else if(Percent<=65 && Percent>55){

                             System.out.println("Pass");
                }
		else{
			
			 System.out.println("Failed : Give Exam Again ");
		}
	}


}
