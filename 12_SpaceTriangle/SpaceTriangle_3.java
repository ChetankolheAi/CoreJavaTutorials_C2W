
import java.util.*;
class SpaceTriangle{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter The Row Count ");
                int row = sc.nextInt();

		char ch = (char)(64+row);
                for(int i=1;i<=row;i++){
                        char temp = ch;
                        for(int j=1;j<=row;j++){

                                if(j<=row-i){

                                        System.out.print("  ");
                                }
                                else{

                                        System.out.print(temp+++" ");
                                        

                                }
                        }
			ch--;
                        System.out.println();
                }

        }
}
