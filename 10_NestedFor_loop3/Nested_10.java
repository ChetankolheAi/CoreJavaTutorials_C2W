import java.util.*;
class Nested{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Rows");
                int n = sc.nextInt();
                char ch = (char)(64+n);
                char ch1 = 65;
		int num1 = n;
		int num2 = 1;
                for(int i=1;i<=n;i++){
                        for(int j=1;j<=n;j++){
                                if(i%2==0){
					if(j%2!=0){
                                       		System.out.print(ch1+++" ");
					}
					else{
						System.out.print(num2+" ");
					}
					num2++;
                                }
                                else{

                                        if(j%2!=0){
                                                System.out.print(ch--+" ");
                                        }
                                        else{
                                                System.out.print(num1+" ");
                                        }
					num1--;

                                }


                        }
                        ch = (char)(64+n);
                        ch1 = 65;
			num1 =n;
			num2 = 1;
                        System.out.println();                                                                                                                               }
        }
}
