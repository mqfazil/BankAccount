public class Main {
    public static void main(String[] args) {
        DebitAccount d1 = new DebitAccount("A-000-002","Me",5000.0);
        d1.deposit(500);

        CreditAccount c1 = new CreditAccount("A-000-003","Me",5000.0, 2000.0);
        c1.deposit(500);
        c1.withdraw(6000);
    }
}