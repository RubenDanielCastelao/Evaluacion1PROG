
package boletin16;

public class savingAccount extends Account {
    private float interest;
    private double minimumBalance;

    public savingAccount() {
    }

    public savingAccount(float ineterest, double minimumBalance, long numberAccount, Person client) {
        super(numberAccount, client);
        this.interest = ineterest;
        this.minimumBalance = minimumBalance;
    }

    @Override
    public String toString() {
        return super.toString() + "ineterest=" + interest + ", minimumBalance=" + minimumBalance ;
    }
    
    public double setInterest(float interest){
        this.interest = interest;
        return interest;
    }
}
