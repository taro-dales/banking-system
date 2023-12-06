public class BankingSystem {
    public static void main(String[] args) {
        // Instantiate objects and demonstrate the banking system functionality
        Customer customer = new Customer("John Doe", "123 Main St", "john@example.com");
        Account savingsAccount = new SavingsAccount(1000, 0.02);
        customer.addAccount(savingsAccount);

        System.out.println(customer);

        // Perform banking operations
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.addInterest();

        System.out.println(customer);
    }
}
