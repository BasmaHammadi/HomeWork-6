import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int num,i ,n=2;
        System.out.print("Enter number: ");
        Scanner in =new Scanner(System.in);
        num=in.nextInt();
        while (n<num)
            {
            for (i = 2; i < num; i++) {
                if (n % i == 0 && n % 1 == 0)
                    break;
            }
                if (n == i || n == 1)
                    System.out.println(n);
                n++;
        }
    }
}
