public class AccountManipulations {
    static int count = 0;
    public static void Transfer(SavingsAccount fromCust,SavingsAccount toCust,double Amount){
        fromCust.withdraw(Amount);
        toCust.deposit(Amount);
        count++;
    }
    public static void main(String[] args) {
        Customer cs = new Customer(1224,"Prashant Kumar",1234343434,"HDFC12201","Lucknow");
        Customer cs2 = new Customer(1334,"Akash A",1330019,"ICICI00123","Kolkata");
        SavingsAccount sva = new SavingsAccount(12343434,cs,200000,6000);
        SavingsAccount sva2 = new SavingsAccount(1330019,cs2,300000,8000);


        Customer cs3 = new Customer(1225,"Neeladri Parikha",1334343434,"SBIN13201","shimla");
        Customer cs24 = new Customer(1336,"Shubham",1430019,"PUNB00143","jalandhar");
        SavingsAccount sva3 = new SavingsAccount(13343434,cs,400000,7000);
        SavingsAccount sva4 = new SavingsAccount(1430019,cs2,500000,4000);

        Transfer(sva,sva2,35000);
        System.out.println("Current Balance: " + sva.getBalance());
        System.out.println("Current Balance: " + sva2.getBalance());

        Transfer(sva3,sva4,52000);
        System.out.println("Transaction Count:" + count);
        System.out.println("Current Balance: " + sva3.getBalance());
        System.out.println("Current Balance: " + sva4.getBalance());
    }
}
