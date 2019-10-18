package SavingsAccount;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    //create a constructor
    public SavingsAccount( double amount )   {
        this.savingsBalance = amount;

    }//end constructor method

    //create a method to calculate the monthly interest
    public void calculateMonthlyInterest()  {
        double currentInt;

        currentInt = (this.savingsBalance * (annualInterestRate / 100 ) ) / 12;

        this.savingsBalance += currentInt;

    }//end calculateMonthlyInterest method

    //create a method to display the balance
    public void displayCurrentBalance() {
        System.out.printf("$%.2f", this.savingsBalance );

    }//end displayCurrentBalance method

    //create a method that can modify the interest rate
    public static void modifyInterestRate( double rate )    {
        annualInterestRate = rate;

    }//end modifyInterestRate method

    //create the main method
    public static void main( String[] args )    {
        //initialize instances for the problem
        SavingsAccount saver1 = new SavingsAccount( 2000.0 );
        SavingsAccount saver2 = new SavingsAccount( 3000.0 );

        //declare any variables for main method
        int i;

        SavingsAccount.modifyInterestRate( 4.0 );
        System.out.println("Month \t\t Saver1 \t Saver2" );

        //create a for loop to show each month's balance
        for( i = 1; i < 13; ++i )   {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.print("" + "Month " + i + ": \t");
            saver1.displayCurrentBalance();
            System.out.print("\t");

            saver2.displayCurrentBalance();
            System.out.println("");
        }//end for loop

        System.out.println("");

        //display in program the change of interest rate
        System.out.println("Interest Rate: now 5.0%." );
        System.out.println("-----------------------------");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        //display the new balance after interest rate change
        System.out.print("Month 1: \t");
        saver1.displayCurrentBalance();
        System.out.print("\t");
        saver2.displayCurrentBalance();
        System.out.println("");

    }//end main method

}//end public class SavingsAccount
