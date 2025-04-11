import java.util.*;
class Nested{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter The Number Of Rows");
                int n = sc.nextInt();
                char ch = (char)(96+n);
		int num=1;
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){

                                System.out.print(ch+""+num+++" ");


                        }
                       
                        System.out.println();

                }
        }
}
