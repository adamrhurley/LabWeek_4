public abstract class bankAccount
{
    private int accNum;
    protected double balance;

public bankAccount(){this(0,0);}
    public bankAccount (int accNum, double balance){
       this.accNum = accNum;
        this.balance = balance;

    }


    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private void setName(String name) {
    }

    @Override
    public String toString() {
        return "bankAccount{" +
                "accNum = " + accNum +
                ", balance = " + balance +
                '}';
    }
}
