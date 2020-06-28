package adapter.ex2;

/**
 * USA standard scale MPH
 * @author ataik
 *
 */
interface Movable{
	public double getSpeed();
}

/**
 * Car object for getting speed in MPH
 * @author ataik
 *
 */
class BugatiVeyron implements Movable{

	@Override
	public double getSpeed() {
		// returns speed in Mph
		return 268;
	}
}

// What if we want to use this car object to get speed in KMPH

/**
 * specification to adapt the Movable objects
 * @author ataik
 *
 */
interface MovableAdapter {
	
	public double getSpeed();
}

/**
 * 
 * @author ataik
 *
 */
class MovableAdapterImpl implements MovableAdapter{

	private final Movable usaMovable;
	
	public MovableAdapterImpl(Movable movable) {
		this.usaMovable = movable;
	}
	
	@Override
	public double getSpeed() {
		// return in Kmph
		return convertMPHtoKMPH(usaMovable.getSpeed());
	}
	
	private double convertMPHtoKMPH(double mph) {
		double kmph = mph * 1.60934;
		return kmph;
	}
	
}

public class Ex2Main {
	public static void main(String[] args) {
		BugatiVeyron movableBugatiVeyron = new BugatiVeyron();
		MovableAdapter movableAdapter = new MovableAdapterImpl(movableBugatiVeyron);
		
		movableAdapter.getSpeed(); 
	}
}
