public class OOP {
    //	String fName = "Prathamesh";
//	String lName = "Bhosale";
//	int age = 22;
//	
//	int x = 5;
//	
//	static void myStaticMethod() {
//		System.out.println("Static Hello World!");
//	}
//	
//	public void myPublicMethod() {
//		System.out.println("Public Hello World!");
//	}
//	
//	
//	public void fullThrottle() {
//		System.out.println("The car is going as fast as it can!");
//	}
//	
//	public void speed(int maxSpeed) {
//		System.out.println("The maximum speed is: " + maxSpeed);
//	}
//	
	
	int x, year;
	String name, model;
	
	
	//created a class constructor
	//Constructor must match the class name // also cannot have a return type like void and all
	public OOP(String carName, String modelName, int purchase_year) {
		name = carName;
		model = modelName;
		year = purchase_year;
	}
}
