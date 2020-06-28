package adapter.ex1;

/**
 * The specification which all cables connecting to iphone must implement
 * this states the commands with which the cable should should allow passing to other end
 * @author ataik
 *
 */
interface IphoneLighteningConnector{
	public void chargePhone();
	public void enableUSBHighSpeedDataTransfer();
	public void playhighDefinitionAudio();
}

class IphoneCable implements IphoneLighteningConnector{

	@Override
	public void chargePhone() {
		System.out.println("Charging Iphone via Lightening cable");
	}

	@Override
	public void enableUSBHighSpeedDataTransfer() {
		System.out.println("establishing usb connection to Iphone via Lightening cable");
	}
	
	@Override
	public void playhighDefinitionAudio() {
		System.out.println("Playing high def audio via Lightening cable");
	}
}

/**
 * the specification which all cables should follow
 * @author ataik
 *
 */
interface AuxConnector{
	public void playAudio();
}

class AuxCable implements AuxConnector{

	@Override
	public void playAudio() {
		System.out.println("Playing audio via aux cable");
	}
	
}

// what if I want to connect aux cable to IphoneLighteningConnector port
// solution adapter pattern
// Adaptee auxCable 
// Client IphoneLighteningConnector
class AuxAdapter implements IphoneLighteningConnector{
	
	private AuxConnector auxConnector;
	
	public AuxAdapter(AuxConnector auxConnector) {
		this.auxConnector = auxConnector;
	}
	
	@Override
	public void chargePhone() {
		System.out.println("Cannot charge phone via aux cable");
	}

	@Override
	public void enableUSBHighSpeedDataTransfer() {
		System.out.println("Cannot establish USB connection via aux cable");
	}

	@Override
	public void playhighDefinitionAudio() {
		this.auxConnector.playAudio();
	}
	
}

public class Ex1Practice {
	
	public static void main(String[] args) {
		IphoneLighteningConnector iphoneLighteningConnector = new IphoneCable();
		AuxCable awesomeHeadphones = new AuxCable();
		
		// lets plug our awesome headphones into the auxAdapter which 
		// (acts as a translator) and connects to iphones lightening connector
		AuxAdapter auxAdapter = new AuxAdapter(awesomeHeadphones);
		auxAdapter.playhighDefinitionAudio();
	}
}
