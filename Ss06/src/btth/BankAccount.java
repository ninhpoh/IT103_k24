package btth;

public class BankAccount {
    private String STK;
    private  String ownerName;
    private  double balance;

    public BankAccount(){}
    public BankAccount(String STK, String ownerName, double balance){
        this.STK = STK;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getSTK() {
        return STK;
    }

    public void setSTK(String STK) {
        this.STK = STK;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
