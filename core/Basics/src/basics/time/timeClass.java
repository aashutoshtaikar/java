package basics.time;

public class timeClass {
	public static void militaryTime() {
		Time someTime = new Time();
		someTime.setTime(11, 22, 33);
		System.out.println(someTime.toMilitary());
	}
	
	public static void RegularTime(){
		Time someTime = new Time();
		
		someTime.setTime(11, 00, 00);
		System.out.println(someTime.toRegular());
		
		someTime.setTime(12, 00, 00);
		System.out.println(someTime.toRegular());
		
		someTime.setTime(13, 00, 00);
		System.out.println(someTime.toRegular());
	}
	
	public static void main(String[] args) {
		RegularTime();
	}

}
