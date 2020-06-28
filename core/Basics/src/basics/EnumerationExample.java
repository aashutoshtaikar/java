package basics;

import java.util.EnumSet;

/*
 * Enumerations are contants and are also objects packed together
 * */

enum TrafficLight{
	//contants, each constant is an object
	RED("Stop",22),
	YELLOW("Yield",10),
	GREEN("Move",5);
	
	
	private final String desc;
	private final int intense;
	
	
	private TrafficLight(String description, int intensity) {
		desc = description;
		intense = intensity;
	}

	public String getDesc() {
		return desc;
	}

	public int getIntense() {
		return intense;
	}
	
}

public class EnumerationExample {
	
	//passing enum object by value
	public static void TurnOn(TrafficLight tl) {
		int currentIntensity = tl.getIntense();
		System.out.println("Turning on trafficlight " + tl + " with intensity " + currentIntensity);
		tl = TrafficLight.YELLOW;
	}
	
	public static void main(String[] args) {
		//looping thru the enum class
		for (TrafficLight tl : TrafficLight.values())  {
			System.out.printf("%s\t%s\t%d\n", tl, tl.getDesc(),tl.getIntense());
		}
		
		//Declaring and defining enum object
		TrafficLight xPole = TrafficLight.RED;
		TurnOn(xPole);
		
//		xPole = TrafficLight.YELLOW;
		System.out.println("Changed trafficlight " + xPole + " with intensity " + xPole.getIntense());
		
		
	}

}
