import java.util.*;
public class ATM{
    private bankAccount account;
    public ATM (bankAccount account){
        this.account = account;
    }
    public void displayMenu(){
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1: 
                System.out.print("Enter Amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;

                case 2:
                System.out.print("Enter Amount to deposit: ");
                double depositAmount = sc.nextDouble(); 
                account.deposit(depositAmount);
                break;

                case 3:
                System.out.print("Curret Balance: $" + account.getBalance());
                break;

                case 4:
                exit = true;
                System.out.println("ThankYou for using the ATM. Goodbye!");
                break;

                default:
                System.out.println("Invalid option, Please try again!");
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        bankAccount account = new bankAccount(1000);
        ATM atm = new ATM(account);
        atm.displayMenu();
    }
}