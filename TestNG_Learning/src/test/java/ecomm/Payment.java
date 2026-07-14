package ecomm;

import org.testng.annotations.Test;

public class Payment {

	@Test
	public void CC() {
		System.out.println("credit card");
	}

	@Test
	public void DC() {
		System.out.println("debit card");
	}

	@Test
	public void Net() {
		System.out.println("net banking");
	}

	@Test(groups = {"check UPI"})
	public void UPI() {
		System.out.println("UPI payment");
	}

}
