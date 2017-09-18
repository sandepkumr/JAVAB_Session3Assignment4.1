/**
 * 
 */
package assignment4_1;

/**
 * Java program to show use of method overriding and method overloading
 *
 */
class Bank {// Class Bank that says over all interest rate
	
	
	public void interest() { // method to print interest given by Banks
		
		System.out.println("Interest rate given by bank's is "+9+"%"); // Print interest rate
	}
	
}
class IndianBank extends Bank { // Class Indian Bank which is child of Bank
	
	public void interest() { // Parent method overridden by IndianBank by giving lesser interest
		
		System.out.println("Interest rate given by Indian bank is "+8+"%"); // Print interest rate
	}
	
	public void creditCard() { // method to print new Credit card
		
		System.out.println("New Indian Bank credit card with no extra charges"); // Print message
	}

	public void creditCard(int annualCharge) {// method overridden to print new Credit card with annual charges
		
		System.out.println("New Indian Bank credit card with annual charge of "+annualCharge+" Rupees"); // Print message
		
	}

	public static void main(String[] args) { // main method starts
		// TODO Auto-generated method stub
		
		IndianBank in = new IndianBank(); 	// Creating object for Indian Bank
		in.interest(); // Overridden method will be printed, i.e, interest given by Indian Bank
		
		in.creditCard(); // Calling creditCard method with no charges
		in.creditCard(900); // Calling overloaded method to print new credit card with charges also

	}

}
