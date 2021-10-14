package basics.abstraction.interfaces;

public class MJaffery {
	
	public static void main(String[] args) {
		/*
		 * AbdulMalik abdulMalik = new AbdulMalik(); abdulMalik.clarifyPaySlip();
		 */
		ARahman aRahman = new ARahman();
		aRahman.clarifyPaySlip();
	}
	
	void getClarification(IAccountsListener emailAddress) {
		emailAddress.clarifyPaySlip();
		
	}

}
