import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //   A   //
        int num = 2, sum = 0;
        while (num<=100){
            if (num%2==0) {
                sum = sum + num;
            }
            num++;
        }
        System.out.println("The sum of all even numbers between 2 and 100: "+sum);

        //   B   //
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a :");
        int a=in.nextInt();
        System.out.print("Enter b :");
        int b=in.nextInt();
        int num2 = a, sum2 = 0;
        while (num2<=b){
            if (num2%2!=0) {
                sum2 = sum2 + num2;
            }
            num2++;
        }
        System.out.println("The sum of all odd numbers between "+ a +" and "+ b +" :"+sum2);

        //   C   //
        System.out.print("Enter number of 4 digits:");
        int c=in.nextInt();
        int c1 , c2 , c3 , c4 , x =0;
        if (c<=9999&&c>=1000)
        {
             c1 = (c / 1000);
             c2 = (c / 100) % 10;
             c3 = (c / 10) % 10;
             c4 = (c % 10);
             if (c1%2!=0)
             { x=c1;
                    if (c2%2!=0)
                    {x=c1+c2;
                        if (c3%2!=0)
                        {x=c1+c2+c3;
                            if (c4%2!=0)
                            {x=c1+c2+c3+c4;
                            }}}}
            System.out.println(x);
        }
        else
        {System.out.println("Input error");}


}}
