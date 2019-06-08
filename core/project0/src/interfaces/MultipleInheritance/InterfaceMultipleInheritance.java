/*Java 8 only*/
package interfaces.MultipleInheritance;

interface Writer{
	default void write() {
		System.out.println("writing from Writer");
	}
	
	void draw();
}

interface AdvancedWriter{
	default void write() {
		System.out.print("writing from AdvancedWriter");
	}
}

class Pen implements Writer,AdvancedWriter{
	@Override
	public void draw() {
		System.out.println("drawing by Pen");
	}

	@Override
	public void write() {
		System.out.println("writing with custom ink by Pen");
	}
	//due to multiple inheritance we need to explicitly define the implementation of write() 
	//OR we can call the interface's implementation using super
}

class Pencil implements Writer, AdvancedWriter{

	@Override
	public void draw() {
		System.out.println("drawing by Pencil");
	}

	@Override
	public void write() {
		AdvancedWriter.super.write();
		
		System.out.println(" by Pencil");
	}
	
}



public class InterfaceMultipleInheritance {
	
	public static void main(String[] args) {
		Writer x = new Pen();
		x.draw();
		x.write();
		
		//here even though y.write() executes the AdvancedWriter we can use Writer interface's reference
		Writer y = new Pencil();
		y.draw();
		y.write();
	}

}
