package builder;

public class Shop {

	public static void main(String[] args) {
		Phone iphone = new Phone.PhoneBuilder().os("ios").ram(2).processor("snapdragon").battery(3100).screenSize(5.5).build();
		System.out.println(iphone.toString());
	}

}
