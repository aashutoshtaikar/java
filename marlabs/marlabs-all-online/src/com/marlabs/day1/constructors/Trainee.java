package com.marlabs.day1.constructors;

public class Trainee {
	int id;
	String name;
	String trainedOn;
	String trainingLocation;
	String preferredLocation;
	String deployedLocation;

	public Trainee() {
		System.out.println("default constr");
		trainingLocation = "NJ";
		preferredLocation = "London";
	}

	/**
	 * @param id
	 * @param name
	 * @param trainedOn
	 * @param trainingLocation
	 */
	public Trainee(int id, String name, String trainedOn, String trainingLocation) {
//		this(id,name,trainedOn,trainingLocation,"OR", "NJ"); //chaining to one constr only(Design principle)
		this.id = id;
		this.name = name;
		this.trainedOn = trainedOn;
		this.trainingLocation = trainingLocation;
	}

	/**
	 * @param id
	 * @param name
	 * @param trainedOn
	 * @param trainingLocation
	 * @param preferredLocation
	 * @param deployedLocation
	 */
	public Trainee(int id, String name, String trainedOn, String trainingLocation, String preferredLocation,
			String deployedLocation) {
		this();
		System.out.println("from all params constr");
//		this(); //constr call must be the first statement
		this.id = id; // this @ variable level
		this.name = name;
		this.trainedOn = trainedOn;
		this.trainingLocation = trainingLocation;
		this.preferredLocation = preferredLocation;
		this.deployedLocation = deployedLocation;
		display(); // this at method level
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", " + (name != null ? "name=" + name + ", " : "")
				+ (trainedOn != null ? "trainedOn=" + trainedOn + ", " : "")
				+ (trainingLocation != null ? "trainingLocation=" + trainingLocation + ", " : "")
				+ (preferredLocation != null ? "preferredLocation=" + preferredLocation + ", " : "")
				+ (deployedLocation != null ? "deployedLocation=" + deployedLocation : "") + "]";
	}

	public Trainee display() {
		System.out.println(this); // current obj
		return this; // this as method return type
	}

}
