import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a word :");
        String n=in.next();
        for (int i = 0; i <n.length() ; i++) {
            System.out.println(n.charAt(i));

        }
    }
}
