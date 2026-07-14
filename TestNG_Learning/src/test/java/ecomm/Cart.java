package ecomm;

import org.testng.annotations.Test;

public class Cart {

	@Test(groups = {"check UPI"})
	public void addToCart() {
		System.out.println("add to cart");
	}

	@Test
	public void manageCart() {
		System.out.println("manage cart");
	}

	@Test
	public void removeCart() {
		System.out.println("remove from cart");
	}
}
