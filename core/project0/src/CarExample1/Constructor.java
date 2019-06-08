package CarExample1;


class Car{
	private String m_name;
	private double chasis_number;
	
	Car(){}
	
	Car(String name, double chasis_number ){
		this.Name(name);
		this.setChasis_number(chasis_number);
	}
	
	void print() {
		System.out.println("Car:" + this.Name());
		System.out.println("Chasis number:" + this.getChasis_number());
	}


	public String Name() {
		return m_name;
	}


	public void Name(String name) {
		this.m_name = name;
	}


	public double getChasis_number() {
		return chasis_number;
	}


	public void setChasis_number(double chasis_number) {
		this.chasis_number = chasis_number;
	}
	
}


public class Constructor {

	public static void main(String[] args) {
		Car x = new Car("Merc", 456234.544444);
		x.print();

		Car y = x;
		y.Name("BMW");
		System.out.println("Car:" + y.Name());
	}

}
