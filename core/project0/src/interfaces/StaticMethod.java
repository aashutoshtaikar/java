package interfaces;

@FunctionalInterface
interface Writer{
	//variables are final and static 
	int NUM = 12;
	String SOMESTRING = "something";
	
	default void write() {
		System.out.println("Writing from Writer");
	}
	
	void writeExtended();

	//since java 8
	static void draw() {
		System.out.println("drawing from Writer");
	}
}

class Pen implements Writer{

	@Override
	public void writeExtended() {
//		NUM = 8; //cannot do this as it is final
	}
	
}

public class StaticMethod {

	public static void main(String[] args) {
		Writer x = ()->{
			System.out.println("extending write");
		};
			
		x.write();
		x.writeExtended();
		Writer.draw();
	}

}
