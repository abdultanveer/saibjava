package basics.polymorphism;

/**
 * poly - many
 * morph - take shape
 * @author Admin
 *
 */
public class IncomeTax {
	
	//this method is not overriden in its subclass
	int calculateTax(int income){
		return income/10;
	}
	
	
	/**
	 * method overloading
	 * @param income
	 * @param luxurySpending
	 * @return
	 */
	int calculateTax(int income, int luxurySpending) {
		
		int incomeTax = income/10;
		int luxuryTax = luxurySpending/5;
		
		return incomeTax + luxuryTax;
	}
	
	

}
