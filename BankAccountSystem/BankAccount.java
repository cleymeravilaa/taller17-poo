package BankAccountSystem;

public abstract class  BankAccount {

    protected String numberAccount, ownerName;
    protected double balance;

    public BankAccount(String numberAccount, String ownerName, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.numberAccount = numberAccount;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
}
