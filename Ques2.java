import java.util.*;

class BankAccount
{
    int acc_no;
    double balance;

    Scanner obj = new Scanner(System.in);

    BankAccount(int a, double b)
    {
        this.acc_no=a;
        this.balance=b;
    }

    void withdraw() throws Exception
    {
        double amount;
        System.out.println("Enter Amount you want to withdraw : ");
        amount = obj.nextInt();
        if(balance>=amount )
        {
            balance = balance-amount;
            System.out.println("Remaining Balance in the account is : " + balance);
        }
        else
        {
            throw new Exception("You have a insufficient and balance.");
        }
    }
    void deposit()
    {
        int amount;
        System.out.println("Enter the amount you want to deposit: ");
        amount = obj.nextInt();
        if(amount>=0)
        {
            balance=balance+amount;
            System.out.println("Balance is : " +balance);
        }
        else
        {
            System.out.println("Invalid amount.");
        }
    }

    void show()
    {
        System.out.println("Your account number is " + acc_no + " and balance is "+ balance);
    }
}


public class Ques2 {
    public static void main(String[] args)
    {
        BankAccount bankaccount = new BankAccount(  2022, 5000);
        Scanner scn= new Scanner(System.in);
        bankaccount.show();
        bankaccount.deposit();
        bankaccount.show();

        try
        {
            bankaccount.withdraw();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        bankaccount.show();
    }
}
