package basics.abstraction.interfaces;

/**
 * implementation of ISwitchBoardListener.
 * @author Admin
 *
 */
public class HavellsAppliances implements ISwitchBoardListener {

	@Override
	public void switchOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchTwo() {
		System.out.println("havells bulb is on");
	}

	@Override
	public void switchThree() {
		System.out.println("havells tubelight is on");
		
	}

	@Override
	public void switchFour() {
		System.out.println("havells AC is on");
		
	}

	@Override
	public void fanKnob() {
		System.out.println("havells fan is on");
		
	}

}
