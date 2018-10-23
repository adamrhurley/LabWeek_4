public class savingsAccount extends bankAccount implements Taxable,Transactable
{
    private double balance;

    @Override
    public double calcTax() {
        return 0;
    }

    @Override
    public void lodge() {

    }

    @Override
    public void withdraw() {

    }
}
