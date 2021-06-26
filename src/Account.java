public class Account {
    protected int accNumber;
    protected Customer custobj;
    protected double balance;

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public Customer getCustobj() {
        return custobj;
    }

    public void setCustobj(Customer custobj) {
        this.custobj = custobj;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(int accNumber,Customer custobj,double balance)
    {
        this.accNumber  = accNumber;
        this.custobj = custobj;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        return false;
    }
    public boolean deposit(double amount){
        return false;
    }

}
