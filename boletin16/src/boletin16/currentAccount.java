
package boletin16;

public class currentAccount extends Account{
    private final float interestRate = 1.5f;

    public currentAccount() {
    }

    public currentAccount(long numberAccount, Person client) {
        super(numberAccount, client);
    }    
    
    @Override
    public String toString() {
        return super.toString() + "interestRate=" + interestRate ;
    }
    
}
