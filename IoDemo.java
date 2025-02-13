import java.util.*;

class ioDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some text: ");
        String firstInputInJava = sc.next();
        System.out.println("You entered: " + firstInputInJava);
        sc.close();
    }
}
