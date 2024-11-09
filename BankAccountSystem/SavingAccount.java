package BankAccountSystem;

public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String numberAccount, String ownerName, double initialBalance, double interestRate) {
        super(numberAccount, ownerName, initialBalance);
        if (interestRate < 0) {
            throw new IllegalArgumentException("La tasa de interés no puede ser negativa");
        }
        this.interestRate = interestRate;
    }

    public SavingAccount(String numberAccount, String ownerName, double initialBalance) {
        this(numberAccount, ownerName, initialBalance, 0.05);
    }

    public double getInterestRate() {
        return interestRate;
    }
    
    @Override
    public void deposit(double amount) {
        if (amount <= 0 ) {
            throw new IllegalArgumentException("El monto a depositar no puede ser negativo");
        }
        double interest = super.balance * interestRate;
        super.balance += amount + interest;
        System.out.println("Se ha depositado " + amount + " al saldo de la cuenta");
        System.out.println("El saldo de la cuenta ahora es " + super.balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0 ) {
            throw new IllegalArgumentException("El monto a retirar no puede ser negativo");
        }
        if (super.balance < amount) {
            throw new IllegalArgumentException("No hay suficiente saldo en la cuenta");
        }
        super.balance -= amount;
        System.out.println("Se ha retirado " + amount + " del saldo de la cuenta");
        System.out.println("El saldo de la cuenta ahora es " + super.balance);
    }

    @Override
    public double getBalance() {
        return super.balance;
    }
    
}
