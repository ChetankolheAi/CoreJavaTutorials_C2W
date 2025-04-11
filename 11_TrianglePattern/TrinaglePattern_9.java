import java.util.*;
class TrianglePattern{

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Number Of Rows");
                int n = sc.nextInt();
                char ch = (char)(64+n);
                for(int i=1;i<=n;i++){
			
                        for(int j=n;j>=i;j--){
                                System.out.print(ch--+" ");
                        }
                        ch = (char)(64+n);
                        System.out.println();
                }
        }

}
