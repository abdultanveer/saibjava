package basics.polymorphism;

public class Gst extends IncomeTax {
	//new meaning to an existing method 
	//or adding or removing functionality from an existing method
	
	
	@Override
	int calculateTax(int income, int luxurySpending) {
		int oldTax = super.calculateTax(income, luxurySpending);
		int newTax = 0;
		if(income > 10000) {
			newTax += income/5; // newTax = newTax + 20% income
		}
		if(luxurySpending > 5000) {
			newTax += luxurySpending/2.5;
		}
		
		return oldTax + newTax;
	}
	

}
