package builderPattern.hacky;

class Car{
	private String name;
	private String chasis;
	private int horsepower;
	
	
	public Car name(String val) {
		this.name = val;
		return this;
	}
	
	public Car chasis(String val) {
		this.chasis = val;
		return this;
	}
	
	public Car horsepower(int val) {
		this.horsepower = val;
		return this;
	}
	
	public void print() {
		System.out.println(name + "\t" + chasis + "\t" + horsepower);
	}

	
}

public class PartialBuilder {

	public static void main(String[] args) {
		Car x = new Car().chasis("CVS111").name("C300").horsepower(200);
		x.print();
		
	}

}
