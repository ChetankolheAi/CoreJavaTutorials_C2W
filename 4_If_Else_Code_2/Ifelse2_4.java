





import java.util.*;
class Ifelse2_4{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Percentage");
		int Percent = sc.nextInt();
		
		if(Percent>85 && Percent<=100){

			System.out.println( "Medical Is Better Career Field For You");

		}
		else if(Percent<=85 && Percent>75){

			     System.out.println(" Engineering Is Better Career Field For You");
			     
		}
		else if(Percent<=75 && Percent>65){

                             System.out.println(" Pharmacy Is Better Career Field For You");
                }
		else if(Percent<=65 && Percent>55){

                             System.out.println(" BSC Is Better Career Field For You");
                }
		else{
			
			 System.out.println("Give Exam Again");
		}
	}


}
