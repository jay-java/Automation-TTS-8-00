package core;

class Student {
	int enrNo;
	String name;
	double per;
	String address;
	static String cname = "XYZ";

	Student(int enrNo, String name, double per, String address) {
		this.enrNo = enrNo;
		this.name = name;
		this.per = per;
		this.address = address;
	}

	public void showData() {
		System.out.println("enrNo : " + enrNo + " name : " + name + " per : " + per + " address : " + address
				+ " cname : " + cname);
	}

	public static void showStaticData() {
		System.out.println("static show method");
	}
}

public class P013_static {
	public static void main(String[] args) {
		Student s1 = new Student(1, "java", 65.5, "ahmedabad");
		s1.showData();
//		s1.showStaticData();
		Student s2 = new Student(2, "python", 75.5, "delhi");
		s2.showData();

		Student.showStaticData();
	}
}
