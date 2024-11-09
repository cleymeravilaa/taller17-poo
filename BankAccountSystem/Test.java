package BankAccountSystem;

public class Test {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount("123456789", "Juan Perez", 1000, 0.02);

        System.out.println("Número de cuenta: " + s.getNumberAccount());
        System.out.println("Nombre del propietario: " + s.getOwnerName());
        System.out.println("Saldo inicial: " + s.getBalance());
        System.out.println("Tasa de interés: " + s.getInterestRate());
        System.out.println("------------------------------------------------");
        s.deposit(100);
        System.out.println("---------------------------------------------");
        s.withdraw(50);
        System.out.println("---------------------------------------------");
        System.out.println("Saldo: " + s.getBalance());
    }
}
