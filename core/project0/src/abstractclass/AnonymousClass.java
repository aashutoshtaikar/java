package abstractclass;
class Picture{
	public void show() {
		System.out.println("showing from picture");
	}
}

//1. way of overriding
class Cartoon extends Picture{
	@Override
	public void show() {
		System.out.println("showing from cartoon");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		Picture pic0 = new Cartoon();
		pic0.show();
		
		//2. way of overriding
		Picture pic = new Picture() {
			public void show() {
				System.out.println("showing from anonymous class");
			}
		};
		pic.show();
	}

}
