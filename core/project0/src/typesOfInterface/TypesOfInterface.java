package typesOfInterface;

import java.util.Random;

// Types of interface
// 1. Normal
// 2. Single abstract method - only one abstract method - (In java 8) Functional Interface - Can use Lambda Expression 
// 3. Marker interface - No method

@FunctionalInterface
interface IChasis{
	void build(int x);
//	void getNumber(); //Functional interface(must be single abstract method) annotation prevents this and gives error
}

interface ChasisMarker{	
}

class A implements ChasisMarker{
	public void run() {
		System.out.println("runnig anon");
	}
}

public class TypesOfInterface {

	public static void main(String[] args) {
		//lamda expressions works with FunctionInterface as it consist of only 1 method
		IChasis chasis = (int x)->
		{
			System.out.println("building chasis number: "+ x);
		};
		chasis.build(4);
		
		

	}

}
