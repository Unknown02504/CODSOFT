public class bankAccount{
    private double balance;
    public bankAccount(double intitialBalance){
        this.balance = intitialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double depositAmount){
        if(depositAmount>0){
            balance+=depositAmount;
        }
        else{
            System.out.println("Deposit amount must be positive");
        }
    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0 && withdrawAmount<=balance){
            balance -= withdrawAmount;
            System.out.println("Successfully withdrawn: $"+withdrawAmount);
        }
        else if(withdrawAmount> balance){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Withdraw Amount must be positive");
        }
    }
}