package week3.day1.assignment3;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("Deposited");
	}
	
	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
		ab.deposit();
		
		
		ab.saving();
		ab.fixed();
		ab.deposit();
		
	}

}
