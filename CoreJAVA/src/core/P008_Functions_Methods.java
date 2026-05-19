package core;

import java.util.Scanner;

//access specifier -> public, private, protected, default
class Abc {
	// without return type without parameter
	public void createAccount() {
		System.out.println("create account");
	}

	// without return type with parameter
	public void getNumber(int num) {
		System.out.println("num = " + num);
	}

	// with return type without parameter
	public int call() {
		System.out.println("call fun");
		return 457;
	}

	// with return type with parameter
	public double fun(int num) {
		System.out.println("number is coming from main method = " + num);
		return num;
	}

	public double getSquare(double num) {
		System.out.println("num is coming from user = " + num);
		return num * num;
	}

}

public class P008_Functions_Methods {
	public static void main(String[] args) {
		System.out.println("main method in functins class");
		Abc a = new Abc();
		a.createAccount();
		a.getNumber(123);
		int num = a.call();
		System.out.println("number is coming from call method = " + num);
		double num1 = a.fun(321);
		System.out.println("num1 is coming from fun method = " + num1);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to get Sqaure = ");
		double num2 = sc.nextDouble();
		double res = a.getSquare(num2);
		System.out.println("square of " + num2 + " is = " + res);
	}
}
