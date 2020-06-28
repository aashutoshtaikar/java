package adapter.ex2;

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

interface AuxConnector{
	public void playAudio();
}

class AuxCable implements AuxConnector{

	@Override
	public void playAudio() {
		System.out.println("Playing audio via aux cable");
	}
	
}

interface AuxConnectorAdapter extends AuxConnector{
}

public class Ex2Practice {
	public static void main(String[] args) {
		
	}
}
