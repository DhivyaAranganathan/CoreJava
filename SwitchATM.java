package Loop;
import java.util.Scanner;
public class SwitchATM 
{
	Scanner sc=new Scanner(System.in);
	void Operation()
	{
		int balance=5000,deposit,withdraw = 0;
		while(true)
		{
		System.out.println("Automated Teller Machine");
		System.out.println("1 for Withdraw");
		System.out.println("2 for Deposit");
		System.out.println("3 for Check Balance");
		System.out.println("4 for Exit");
		System.out.println("Enter ur Choice :");
		int ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
			System.out.println("Enter money to be Withdraw :");
			withdraw=sc.nextInt();
			if(balance>=withdraw)
			{
				balance=balance-withdraw;
				System.out.println("Please collect your money");
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
			System.out.println("");
			break;
		case 2:
			System.out.println("Enter your deposited money :");
			deposit=sc.nextInt();
			{
				balance=balance+deposit;
				System.out.println("your money has been successfully deposited ");
			}
			System.out.println("");
			break;
		case 3:
			System.out.println("balance :"+balance);
			System.out.println("");
			break;
		case 4:
			System.exit(0);
		}
		
	}
		
	}

	public static void main(String[] args)
	{
		SwitchATM atm=new SwitchATM();
		atm.Operation();
	}

}

