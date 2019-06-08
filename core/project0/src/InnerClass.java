


class Car{ //outerclass
	String name;
	
	public void PrintDetails() {
		System.out.println("Car:" + name);
	}
	
	
	class Engine{	//innerclass
		String name;
		int horsepower;
		
		public void PrintDetails() {
			System.out.println("Engine:" + name);
			System.out.println("Horsepower:" + horsepower);
		}
	}
	
}

public class InnerClass {
	public static void main(String args[]) {
		
		Car Merc = new Car();
		Merc.name = "Mercedes c300";
		Car.Engine MercEng = Merc.new Engine();
		MercEng.name = "AMG6000";
		MercEng.horsepower = 300;
		
		Merc.PrintDetails();
		MercEng.PrintDetails();
	}
}
