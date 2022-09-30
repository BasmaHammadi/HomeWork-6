public class Q1 {
     private final double balance ;
    private double balanceR;
    public Q1(double balance) {
        this.balance = balance;
    }

    public double readBalance()
    {
        return balance;
    }
    public double readRate()
    {
        double rate = 10;
        double balanceR=(balance*(rate /100))+balance;
        return balanceR;    }

    public double yearsToMillion()
    {
       double year=1;
       while (balanceR<=1000000){
           balanceR=balanceR*year;
           year++;
       }
        return year;
    }
}

