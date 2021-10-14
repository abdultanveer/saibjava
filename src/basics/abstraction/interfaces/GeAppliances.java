package basics.abstraction.interfaces;

/**
 * if abdul wears/implements a white coat.. he'll look like a doctor
 * @author Admin
 *
 */
public class GeAppliances implements ISwitchBoardListener{

	@Override
	public void switchOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchTwo() {
		System.out.println("ge bulb is on");
	}

	@Override
	public void switchThree() {
		System.out.println("ge tubelight is on");
	}

	@Override
	public void switchFour() {
		System.out.println("ge AC is on");
		
	}

	@Override
	public void fanKnob() {
		System.out.println("ge fan is on");
		
	}

}
