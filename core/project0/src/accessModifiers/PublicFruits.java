package accessModifiers;

//package accessible class
class PackageFruits{
	String _default = "default (package accessible)";
	
	private String _private = "private (class/instance accessible)";
	
	protected String _protected = "protected (class and derived class accessible)";
	
	public String _public = "public (accessible across the package)";
}

//can be accessed by importing
public class PublicFruits {
	String _default = "default (package accessible)";
	
	private String _private = "private (class/instance accessible)";
	
	protected String _protected = "protected (class and derived class accessible)";
	
	public String _public = "public (accessible across the package)";
	
}
