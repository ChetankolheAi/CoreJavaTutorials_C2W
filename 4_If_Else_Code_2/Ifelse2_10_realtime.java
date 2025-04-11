





import java.util.*;
class Ifelse2_10_realtime{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter IceCream Flavour");
		System.out.println("1.Mango IceCream");
		System.out.println("2.SitaFal");
		System.out.println("3.Black Current");
		System.out.println("4.Stawberry");
		System.out.println("5.Blue Berry");
		System.out.println("6.Chocolate");
		int Flavour = sc.nextInt();
		
		if(Flavour == 1){

			System.out.println( "Flavour: Mango -- Pay: Rs 300");

		
		}
		 else if(Flavour == 2){

			System.out.println( "Flavour: SitaFal -- Pay: Rs 280");
                }
		else if(Flavour == 3){

			System.out.println( "Flavour: Black Current -- Pay: Rs 240");
			    
		}
		else if(Flavour == 4){

			System.out.println( "Flavour:Stawberry -- Pay: Rs 190");
                          
                }
		else if(Flavour == 5){

			System.out.println( "Flavour :Blue Berry -- Pay: Rs 180");
                        
                }
		else if(Flavour == 6){
			
			System.out.println( "Flavour: Chocolate -- Pay: Rs 150");

		}
		else{
			System.out.println("Invalid Input");

		}
	}


}
