
//Interfaces -> no variables, all methods are public abstract by default

/* https://stackoverflow.com/questions/2430756/why-are-interface-variables-static-and-final-by-default
 * Since interface doesn't have a direct object, the only way to access them is by using a class/interface and 
hence that is why if interface variable exists, it should be static otherwise it wont be accessible at all to 
outside world. Now since it is static, it can hold only one value and any classes that implements it can 
change it and hence it will be all mess.
Hence if at all there is an interface variable, it will be implicitly static, final and obviously public!!!

Why? 
public: for the accessibility across all the classes, just like the methods present in the interface

static: as interface cannot have an object, the interfaceName.variableName can be used to reference it or 
		directly the variableName in the class implementing it.

final: to make them constants. If 2 classes implement the same interface and you give both of them the right to change the value, conflict will occur in the current value of the var, which is why only one time initialization is permitted.

Also all these modifiers are implicit for an interface, you dont really need to specify any of them.
*/

package interfaces.solution;

interface Writer{
//	int asd = 0; // don't do this;
	void write();
}

interface Shapes{
	void drawCircle(); //by default public abstract
}

class Pen implements Writer, Shapes{
	@Override
	public void write() {
		System.out.println("writing with pen");
	}

	@Override
	public void drawCircle() {
		System.out.println("drawing circle with pen");
		
	}
	
}

class Pencil implements Writer{
	@Override
	public void write() {
		System.out.println("writing with pencil");
	}
}



public class Interfaces {

	public static void main(String[] args) {
		
	}

}
