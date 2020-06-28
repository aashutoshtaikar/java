package adapter.ex1;

/**
 * Let’s assume that you are short on ToyDuck objects and you would like to use
 * Bird objects in their place. Birds have some similar functionality but
 * implement a different interface, so we can’t use them directly. So we will
 * use adapter pattern. Here our client would be ToyDuck and adaptee would be
 * Bird.
 * 
 * @see https://www.geeksforgeeks.org/adapter-pattern/
 *
 */

interface Bird {
    // birds implement Bird interface that allows 
    // them to fly and make sounds adaptee interface 
	public void fly();
	public void makeSound();
}

class Sparrow implements Bird{

	@Override
	public void fly() {
		System.out.println("Sparrow flying..furr");
	}

	@Override
	public void makeSound() {
		System.out.println("Sparrow singing...chiw chiw");
	}
}

interface ToyDuck {
    // target interface 
    // toyducks dont fly they just make 
    // squeaking sound 
	public void squeak();
}

class PlasticToyDuck implements ToyDuck{

	@Override
	public void squeak() {
		System.out.println("PlasticToyDuck squeaking...qwack qwack");
	}
	
}

/**
 * You need to implement the interface your 
 * client expects to use. 
 * @author ataik
 *
 */
class BirdAdapter implements ToyDuck{
	private Bird bird;
    
	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}
	
	@Override
	public void squeak() {
		this.bird.makeSound();
	}
}

public class Ex1Main {

	public static void main(String[] args) {
		// adaptee
		Bird bird = new Sparrow();
		
		// client
		ToyDuck toyDuck = new PlasticToyDuck();
		
		//Adapter to adapt Bird object(adaptee) to ToyDuck object(client)
		BirdAdapter birdAdapter = new BirdAdapter(bird);
		birdAdapter.squeak();
		
	}

}
