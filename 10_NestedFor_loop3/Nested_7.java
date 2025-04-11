import java.util.*;
class Nested{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Rows");
                int n = sc.nextInt();
                char ch = (char)(64+n);
                char ch1 = 65;
		
                for(int i=1;i<=n;i++){
			int num =1;
			int x = n;
                        for(int j=1;j<=n;j++){
                                if(i%2!=0){
					System.out.print(num++);
                                       System.out.print(ch1+++" ");
                                }
                                else{
					System.out.print(x--);
                                        System.out.print(ch--+" ");
                                }


                        }
                        ch = (char)(64+n);
                        ch1 = 65;
                        System.out.println();                                                                                                                               }
        }
}
