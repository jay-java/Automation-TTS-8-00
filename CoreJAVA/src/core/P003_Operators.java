package core;

public class P003_Operators {
	public static void main(String[] args) {
		// 1.Assignment -> =,+=,-=,*=,/=
		int i = 1;
		System.out.println("i = " + i);
		i += 2; // i = i + 2
		System.out.println("i = " + i);// 3

		int j = 12;
		j += i;// j = j+i
		System.out.println("j = " + j);

		j -= 2; // j = j-2
		System.out.println("j = " + j);// 13

		j *= i; // j= j* i
		System.out.println("j = " + j);

		j /= 3; // j = j /3
		System.out.println("j = " + j);

		// i=3,j=13
		// 2.Arithmetic -> +,-,*,/,%

		int a = 10, b = 10;
		System.out.println("addition of a and b = " + (a + b));
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// 3.conditional -> >,<,>=,<=,==,!=
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

		// 4.Unary -> ++,--
		int p = 11;
		System.out.println("p = " + p);
		p++; // p = p+1
		System.out.println("p = " + p);
		p--; // p = p-1
		System.out.println("p = " + p);

		// 5.logical -> &&,||,!

		double base = 56.45;
		double height = 23.54;
		double areaOfTraingle = (base * height) / 2;
		System.out.println("area of triangle = " + areaOfTraingle);

		double radius = 57.43;
		double areaOfCircle = Math.PI * radius * radius;
		System.out.println("area of circle = " + areaOfCircle);
	}
}
