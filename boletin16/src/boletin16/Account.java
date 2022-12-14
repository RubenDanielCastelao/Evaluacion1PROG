
package boletin16;

public class Account {
    private long accountNumber;
    private double balance;
    private Person client;

    public Account() {
    }

    public Account(long numberAccount, Person client) {
        this.accountNumber = numberAccount;
        this.client = client;
    }

    public long getNumberAccount() {
        return accountNumber;
    }

    public void setNumberAccount(long numberAccount) {
        this.accountNumber = numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }
    
    public void enter(double enterAmount){
        balance = balance + enterAmount;
    }
    
    public void withdraw(double withdrawAmount){
        if((balance - withdrawAmount)>=0)
        balance = balance - withdrawAmount;
        
        else
        System.out.println("There not enough balance");
    }
    
    public double updateBalace(){
        return balance;
    }
}
