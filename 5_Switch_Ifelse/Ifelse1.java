


import java.util.*;

class Ifelse1 {

    	public static void main(String[] args) {
    
	Scanner sc = new Scanner(System.in);
        
	System.out.print("Enter Traffic Light Color: ");
        
	String signal = sc.next();

        if (signal == "Red"){

            System.out.println("Stop");
	}
        else if (signal == "Green"){

            System.out.println("Go");
	}
        else if (signal == "Yellow"){

            System.out.println("Look And Go");
	}
        else{

            System.out.println("Invalid Input");
	}

    
    }

}

