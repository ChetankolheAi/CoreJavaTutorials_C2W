


import java.util.*;

class ForLoop1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}

