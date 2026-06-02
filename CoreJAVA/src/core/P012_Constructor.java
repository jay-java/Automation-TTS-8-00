package core;

class User {
	// 1.default
	User() {
		System.out.println("this is default cons");
	}

	// 2.parameterized
	User(int i) {
		System.out.println("this is param cons : " + i);
	}

	User(String name) {
		System.out.println("this is para cons : " + name);
	}

	User(int d, int a) {
		System.out.println("this is para cons : d= " + d + " a=  " + a);
	}

	public void call() {
		System.out.println("call method");
	}
}

//3.copy -> object cloning

class Box {
	double length, width, height;

	Box(double length, double width, double height) {
		// this -> to refer current class members/variables
		this.length = length;
		this.width = width;
		this.height = height;
		System.out.println("volume of box by cons= " + (length * width * height));
	}

	public void volume() {
		System.out.println("volume of box by method = " + (length * width * height));
	}

}

public class P012_Constructor {
	public static void main(String[] args) {
		System.out.println("main method");
		User u = new User();
		u.call();

		User u1 = new User(12, 34);

		User u2 = new User("java");

		Box b = new Box(34.34, 65.4, 3.45);
		b.volume();
	}
}
