import java.util.*;

class Percentage {
	    	
		int sub1, sub2, sub3, sub4, sub5;
    		float percentage;

    		Percentage(int sub1, int sub2, int sub3, int sub4, int sub5) {
        		
			this.sub1 = sub1;
        		this.sub2 = sub2;
        		this.sub3 = sub3;
        		this.sub4 = sub4;
        		this.sub5 = sub5;
        		
    		}

    		void calculatePercentage() {
        		
			int total = sub1 + sub2 + sub3 + sub4 + sub5;
        		
			percentage = total / 5.0f;
    		}

    		void display() {
        		
			System.out.println("\n------ Result ------");
        		System.out.println("Subject 1: " + sub1);
        		System.out.println("Subject 2: " + sub2);
        		System.out.println("Subject 3: " + sub3);
        		System.out.println("Subject 4: " + sub4);
        		System.out.println("Subject 5: " + sub5);
        		System.out.println("Percentage: " + percentage + "%");
    		
		}	
	
	}

class Input {
	
    	public static void main(String[] args) {
    	
	    	Scanner sc = new Scanner(System.in);

        	System.out.println("Enter marks for 5 subjects:");

        	System.out.print("Subject 1: ");
        	int sub1 = sc.nextInt();

        	System.out.print("Subject 2: ");
        	int sub2 = sc.nextInt();

        	System.out.print("Subject 3: ");
        	int sub3 = sc.nextInt();

        	System.out.print("Subject 4: ");
        	int sub4 = sc.nextInt();

        	System.out.print("Subject 5: ");
        	int sub5 = sc.nextInt();

        	Percentage obj = new Percentage(sub1, sub2, sub3, sub4, sub5);
        	obj.calculatePercentage();
		obj.display();
    }
}

