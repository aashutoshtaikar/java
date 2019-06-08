package enumExamples.enumExamples2;

enum Mobile{
	APPLE,SAMSUNG,HTC
}

public class EnumExample2 {

	public static void main(String[] args) {
		Mobile m = Mobile.APPLE;
		
	switch (m) {
		case APPLE:
			System.out.println("apple phone");
			break;
		case SAMSUNG:
			System.out.println("samsung phone");
			break;
		case HTC:
			System.out.println("htc phone");
			break;
			
//		case GGG:
//			System.out.println("this won't work as it is not present in the enum class Mobile");
			
		default:
			System.out.println("invalid enum object");
			break;
		}
	}

}
