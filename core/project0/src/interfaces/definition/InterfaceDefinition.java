package interfaces.definition;

// Abstract class -> Declare and define
// Interface -> declare -> java 7
// 			 -> define -> java 8

@FunctionalInterface 
interface IChasis{
	void createChasis(); //Single abstract method
	
	default void show() {
		System.out.println("showing from Chasis");
	}
}

class ChasisImpl implements IChasis{

	@Override
	public void createChasis() {
		System.out.println("creting CHasis");
	}
	
}

public class InterfaceDefinition {

	public static void main(String[] args) {
		IChasis x = new ChasisImpl();
		x.createChasis();
		x.show();
	}

}
