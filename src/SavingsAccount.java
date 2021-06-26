public class SavingsAccount extends Account{
    private double minBalance;

    public SavingsAccount(int accNumber, Customer custobj, double balance,double minBalance) {
        super(accNumber, custobj, balance);
        this.minBalance = minBalance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    @Override
    public boolean withdraw(double amount){
        if(getBalance()-amount > minBalance){
            setBalance(getBalance()-amount);
            System.out.println("Transaction Completed Successfully...");
            System.out.println();
            System.out.println("Amount Debited from " + getAccNumber() + "Rs. " + amount);
            return true;
        }
        else {
            System.out.println("Transaction Failed...Withdraw Amount greater than MinBalance...");
            return false;
        }
    }
    @Override
    public boolean deposit(double amount){
        if (amount < 0) // deposit value is negative
        {
            System.out.println ();
            System.out.println ("Error: Deposit amount is invalid.");
            return false;
        }
        else
        {
            balance = balance + amount;
            System.out.println("Amount Credited in " + getAccNumber() + " Rs. " + amount);
            return true;
        }
    }

}
