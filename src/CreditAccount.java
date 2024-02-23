public class CreditAccount extends Account {
    private double Balance;
    private double creditLimit;
    CreditAccount(String _AccountNumber, String _CustomerFirstName, double _balance, double _creditLimit) {
        this.customerFirstName = _CustomerFirstName;
        this.setaccountNumber(_AccountNumber);
        this.Balance = _balance;
        this.creditLimit = _creditLimit;
    }
    public boolean withdraw(double amount){
        if(Balance + creditLimit >= amount && amount >= 0){
            Balance -= amount;
            System.out.println("The transaction completed successfully");
            System.out.println(Balance);
            return true;
        } else {
            System.out.println("Unable to complete the transaction");
            System.out.println(Balance);
            return false;
        }
    }
    public boolean deposit(double amount) {
        if(amount > 0) {
            Balance += amount;
            System.out.println(Balance);
            return true;
        } else {
            return false;
        }
    }
}
