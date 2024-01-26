public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    public BankAccount(double checkingBalance,double savingsBalance){
    this.checkingBalance = checkingBalance;
    this.savingsBalance = savingsBalance;
    accounts++;
    totalMoney+=(this.checkingBalance+this.savingsBalance);
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getChecking(){
        return this.checkingBalance;
    }

    public void setChecking(double newValue){
        this.checkingBalance = newValue;
    }
    public double getSavings(){
         return this.savingsBalance;
    }
    public void setSavings(double newValue){
        this.savingsBalance=newValue;
    }   
    public static int getAccounts(){
        return BankAccount.accounts;

    }
    public static double getTotalMoney(){
        return BankAccount.totalMoney;
    }

    // METHODS 
        // deposit 
        // - users should be able to deposit money into their checking or savings account
        public void depositCheking(double depositAmount){
            this.checkingBalance+=depositAmount;
            totalMoney+=depositAmount;
        System.out.println(depositAmount+"deposed");

        }

        public void depositSavings(double depositAmount){
            this.savingsBalance+=depositAmount;
            totalMoney+=depositAmount;
            System.out.println(depositAmount+"deposed");
        }
          // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney

    public void withdrawChecking(double withdrawAmount){
        if ((this.checkingBalance-withdrawAmount)>0){
            this.checkingBalance-=withdrawAmount;
            totalMoney-=withdrawAmount;
            System.out.println("operation successful");
        }else{
            System.out.println("not enough money"); 
        };
    }   
    public void  withdrawSaving(double withdrawAmount){
        if((this.savingsBalance-withdrawAmount)>0){
            this.savingsBalance-=withdrawAmount;
            totalMoney-=withdrawAmount;
            System.out.println("operation successful");
        }else{
            System.out.println("not enough money");
        };
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void displayStats(){
        System.out.println("Cheking Account Balance: " + this.getChecking()+"\n");
        System.out.println("Savings Account Balance: " + this.getSavings()+"\n");
    }
}
    