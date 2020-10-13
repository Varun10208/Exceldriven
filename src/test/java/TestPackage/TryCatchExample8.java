package TestPackage;

import org.testng.annotations.Test;

public class TryCatchExample8 {
@Test
	public void trycatch() {
		try {
			int data = 50 / 0; // may throw exception

		}
		// try to handle the ArithmeticException using ArrayIndexOutOfBoundsException

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} 
	//	catch (ArithmeticException e) {
		//	System.out.println("Arithmetic Exception");
		//}
		catch (Exception e) {
			System.out.println("Not specific");
		}
		System.out.println("rest of the code");

	}

}