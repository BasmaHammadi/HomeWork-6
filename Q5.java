import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a word :");
        String n=in.next();
        int x=0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='e'||n.charAt(i)=='o'||n.charAt(i)=='u'||n.charAt(i)=='y')
            x++;
        }
        System.out.println(x);
    }
}
