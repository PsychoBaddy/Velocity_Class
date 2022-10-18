package practicepalace;

public class Practice1 {
	
	float previousBalance = 0;
	float withdrawal;
	float deposit;
	float currentBalance;
	String name;
	
	Practice1(String customerName,float Deposit, float Withdrawal){
		deposit = Deposit;
		withdrawal = Withdrawal;
		name = customerName;
		currentBalance = previousBalance + deposit - withdrawal;
		System.out.println("This is test code");// Default constructor behaviour example
	}
	public void displayBalance() {
		System.out.println("Customer details of  "+name );
		System.out.println("Previous Balance = "+ +previousBalance);
		System.out.println("Amount Deposited is "+deposit);
		System.out.println("Amount Withdrawal is "+withdrawal);
		System.out.println("Current Balance of "+currentBalance);
		System.out.println("####-END DETAILS-#####");
	}
	
	public static void main(String[] args) {
		
		Practice1 customerOne = new Practice1("Asif",500,100);
		customerOne.displayBalance();
		Practice1 customerTwo = new Practice1("Akib",2000.5f,100.56f);
		customerTwo.displayBalance();
		Practice1 customerThree = new Practice1("Babu",2500.5f,1000.56f);
		customerThree.displayBalance();
    }
    
}
