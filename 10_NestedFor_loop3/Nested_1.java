import java.util.*;
class Nested{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows");
		int n = sc.nextInt();

		int num =  n*n;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(num--+" ");

			}
			System.out.println();
		}
	}
}
