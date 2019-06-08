package abstractclass;

interface IWriter{
	void write();
}

class Pen implements IWriter{

	@Override
	public void write() {
		System.out.println("writing from pen");
	}
	
}

public class AnonymousImplementation {

	public static void main(String[] args) {
		/*Anonymous class:
		 * Cannot reuse the implementation 
		 * Will not waste class file memory
		 */		
		
		IWriter mywriter = new IWriter() {
			//Anonymous class
			@Override
			public void write() {
				System.out.println("writing from anonymous implementation");
			}
		};
		mywriter.write();
		
	}

}
