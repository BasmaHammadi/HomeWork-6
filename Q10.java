import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type today price for one dollar in Japanese yen: ");
        double currency= in.nextDouble();
        System.out.print("Type  price: ");
        double currencyConversion= in.nextDouble();
        double x=currencyConversion*currency;
        System.out.println(x);
    }
}
