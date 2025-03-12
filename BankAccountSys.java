public class BankAccountSys {
    static class BankAccount {
        private static String bankName = "HDFC"; // Static variable shared across all accounts
        private static int totalAccounts = 0; // Static counter for total accounts
        private final int accountNumber; // Final variable that cannot be changed
        private String accountHolderName;
        private double balance;

        // Constructor
        public BankAccount(int accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber; 
            this.accountHolderName = accountHolderName;
            this.balance = balance;
            totalAccounts++; // Increment total accounts
        }

        public void displayAccountDetails() {
            if (this instanceof  BankAccount) { // Using instanceof
                System.out.println("Bank Name: " + bankName);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Account Holder: " + accountHolderName);
                System.out.println("Balance: $" + balance);
            }
        }

        public static void getTotalAccounts() {
            System.out.println("Total Bank Accounts: " + totalAccounts);
        }
    }
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(1001, "Bruce Wayne", 7000000);
        BankAccount acc2 = new BankAccount(1002, "Tony Stark", 9000000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}
