package basics.polymorphism;

public class Dashboard {
	
	
	public static void main(String[] args) {
		IncomeTax incomeTax ; //creating a toc row -- stack mem
		//incomeTax = new IncomeTax(); //actual chap -- heap mem
		
		incomeTax = new Gst(); //gst is also a type of incometax
//runtime binding -- during compile incomeTax obj is of type IncomeTax
// but during runtime incomeTax object is pointing to GST object
		int tax = incomeTax.calculateTax(12000,1000);
		int luxTax = incomeTax.calculateTax(12000, 1000);
		System.out.println("your tax is = "+tax);
		System.out.println("your income tax and lux tax = "+ (luxTax - tax));
	}

}
