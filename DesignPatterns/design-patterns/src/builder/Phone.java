package builder;

public class Phone{
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	public static class PhoneBuilder{
		private String os;
		private int ram;
		private String processor;
		private double screenSize;
		private int battery;
		
		public PhoneBuilder os(String os) {
			this.os = os;
			return this;
		}
		
		public PhoneBuilder ram(int ram) {
			this.ram = ram;
			return this;
		}
		
		public PhoneBuilder processor(String processor) {
			this.processor = processor;
			return this;
		}
		
		public PhoneBuilder screenSize(double screenSize) {
			this.screenSize = screenSize;
			return this;
		}
		
		public PhoneBuilder battery(int battery) {
			this.battery = battery;
			return this;
		}
		
		public Phone build() {
			return new Phone(this);
		}

		
	}
	
	private Phone(PhoneBuilder pb) {
		this.os = pb.os;
		this.ram = pb.ram;
		this.processor = pb.processor;
		this.screenSize = pb.screenSize;
		this.battery = pb.battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + "gb, processor=" + processor + ", screenSize=" + screenSize
				+ "inch, battery=" + battery + "mAh]";
	}
	
	

}
