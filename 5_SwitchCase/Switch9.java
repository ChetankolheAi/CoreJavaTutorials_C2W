



import java.util.*;
class Switch9{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter 5 Subject Marks");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int sub4 = sc.nextInt();
		int sub5 = sc.nextInt();
		
		int percentage = (sub1+sub2+sub3+sub4+sub5)/5;

		if(sub1 >= 45 && sub2 >= 45 && sub3 >= 45 && sub4 >= 45 && sub5 >= 45){
			
			switch(percentage/10){
				case 10:
					System.out.println("Outstnading");
					break;
				case 9:
					System.out.println("First Class With Distinction");
					break;
				case 7:
					System.out.println("First Class");
                                        break;
				case 6:
					System.out.println("Second Class");
                                        break;

				case 5:
					System.out.println("Pass");
					break;
				default:
					System.out.println("Invalid input");

			}
                
		}
		else{

			System.out.println("You Failed In Exam");
		}

        }

}
