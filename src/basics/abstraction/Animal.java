package basics.abstraction;

/**
 * abstract classess you can acheive 0-100% abstraction
 * @author Admin
 *
 */
public abstract class Animal {
	public void born() {
		System.out.println("born");
	}
	
	public void die() {
		System.out.println("died");
	}
	
	abstract void eat();
	abstract void sleep();
	abstract void play();

}
