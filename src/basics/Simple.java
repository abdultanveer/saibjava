package basics;

/**
 * class name always starts with uppercase -- SimpleName
 * @author Admin
 *
 */
public class Simple {

	/**
	 * instance variables will start with lower case and follow camel case studentName
	 */
	String name = "abdul";  // instance variable -- partition

	/**
	 * static variable names will all be uppercase, words would be seperated by a _ underscore
	 */
	public static String COLLEGE_NAME = "IIT";

	/**
	 * method name starts with lower case --mainMethod [camel case]
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10; //local variable
		Simple simple = new Simple();
		simple.name = "ansari";
		System.out.println("the local variable is --"+a);
		System.out.println("[partition] the instance variable is --"+simple.name);

	}



}
