public class Q1_main {
    public static void main(String[] args) {
        Q1 a=new Q1(500000);
        System.out.println("Initial investment balance: "+a.readBalance());
        System.out.println("Interest rate: "+a.readRate());
       System.out.println("The number of years it takes for the investment to reach one million dollars:"
        +a.yearsToMillion());

    }
}
