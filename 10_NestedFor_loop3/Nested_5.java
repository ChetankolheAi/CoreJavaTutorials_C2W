import java.util.*;
class Nested{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Rows");
                int n = sc.nextInt();
		char ch =(char)(64+n);
                int num = n ;
                for(int i=1;i<=n;i++){
                        for(int j=1;j<=n;j++){
                                if(i%2!=0){

                                        System.out.print(ch+" ");
                                }
                                else{
                                        System.out.print(num+" ");

                                }
                                
                        }
			ch--;
			num--;
                        System.out.println();                                                                                                                               }
        }
}
