
import java.util.*;
class Nested{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter The Number Of Rows");
                int n =  sc.nextInt();

                for(int i=0;i<n;i++){
                        for(int j=n;j>0;j--){

                                System.out.print(j+" ");

                        }
                        System.out.println();

                }



        }
}
