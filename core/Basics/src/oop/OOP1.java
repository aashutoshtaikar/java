package oop;

/*
  * No garbage values in JAVA like c language but default values 
    int 		0
    float 		0.0
    char 
    boolean	   false
    String 		null
    Object 		null 
 
  * Different ways to create object:
  1. new operator
  2. clone method
  3. Using De-serialization
  4. Using class.forName("fully qualified name eof a class").newInstance()
  
  * Naming:
  Nouns - Classes
  Adjectives - Data Members(Member variables)
  Verb - Member methods(Member functions)
  
  * Method overloading:
  Type, Number and order of args
  
  * Copy constructor: to copy the existing object data for creating a new object  
 
  * JVM architecture
  Byte code -> Class loader subsystem
  
  * Need of static block: 
  static {}
  To enable log 4J function - as static block executes before main method
  Log 4J - open source framework for recording activity of the application
  
  Instance block : 
  {}
  Executed whenever we create an object
  Executed before constructor call
  
  Order of execution
  1. Static block
  2. Main(PSVM) - gets invoked whenever we create an object 
  3. Instance block
  4. Constructor
  
  Singleton Examples:
  search for predef singleton in java
  1. Logger class in Log 4j 
  2. Task Manager instance
  3. JVM instance
  4. In Spring fw - default bean scope is singleton
*/

public class OOP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
