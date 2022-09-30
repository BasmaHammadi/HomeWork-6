import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a word :");
        String n=in.next();
        StringBuilder n2=new StringBuilder(n);
        System.out.println(n2.reverse());
        }
}
