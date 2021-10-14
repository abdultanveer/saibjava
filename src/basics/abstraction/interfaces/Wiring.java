package basics.abstraction.interfaces;

public class Wiring {
	
	public static void main(String[] args) {
		ISwitchBoardListener switchBoard = new HavellsAppliances();//wiring
				//GeAppliances();
		
		// some person clicking the switches -- caller
		switchBoard.switchOne();
		switchBoard.switchTwo();
		switchBoard.switchThree();
		switchBoard.switchFour();
		switchBoard.fanKnob();

	}

}
