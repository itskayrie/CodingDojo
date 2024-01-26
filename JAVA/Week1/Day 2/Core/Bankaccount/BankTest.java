public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1=new BankAccount(1000,550);
        BankAccount account2=new BankAccount(1200,750);
        BankAccount account3=new BankAccount(850,980);


        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.depositCheking(110);
        account1.displayStats();


        account2.depositSavings(200);
        account2.displayStats();

        account3.depositSavings(50);
        account3.displayStats();





        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        account1.displayStats();
        account1.withdrawChecking(15.5);
        account1.displayStats();

        account2.displayStats();
        account2.withdrawChecking(14);
        account2.displayStats();

        account3.displayStats();
        account3.withdrawChecking(20);
        account3.withdrawChecking(21);
        account3.displayStats();


        // Static Test (print the number of bank accounts and the totalMoney)

        System.out.printf("The number of Bank accounts is: %s \n",BankAccount.getAccounts());
        System.out.printf("The total Money of Bank accounts is: %s \n",BankAccount.getTotalMoney() );

    }
}
