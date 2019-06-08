

class Carx{
	private String name;
	private String chasis;
	private int horsepower;

	public Carx name(String val) {
		this.name = val;
		return this;
	}
	
	public Carx chasis(String val) {
		this.chasis = val;
		return this;
	}
	
	public Carx horsepower(int val) {
		this.horsepower = val;
		return this;
	}

	public Carx build() {
		return new Carx(this);
	}
	
	private Carx(Carx obj) {
		
	}
	
	
	public Carx() {
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println(name + "\t" + chasis + "\t" + horsepower);
	}

	
}

public class BuilderPattern {

	public static void main(String[] args) {
		Carx x = new Carx().chasis("CVS111").name("C300").horsepower(200);
		x.print();
	}

}
