
//Inheritance : IS-A , HAS-A
// 1. IS-A
//super class, parent, base
class Calculator{
	public int add(int number1, int number2) {
		return number1+number2;
	}
}

//sub class, child, derived
class Caladv extends Calculator{
	public int sub(int number1, int number2) {
		return number1-number2;
	}
}

//multi level inheritance
class CalVeryAdv extends Caladv{
	public int multiply(int number1, int number2) {
		return number1*number2;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		CalVeryAdv x = new CalVeryAdv();
		System.out.println(x.add(3, 4));
		System.out.println(x.sub(3, 4));
		System.out.println(x.multiply(3, 4));
	}

}
