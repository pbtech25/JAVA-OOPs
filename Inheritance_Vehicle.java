
//If you don't want other classes to inherit from a class, use the final keyword
class Inheritance_Vehicle {
    protected String brand = "Ford"; // Vehicle attribute
    //We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.

    public void honk() { // Vehicle Method
        System.out.println("Tuuuut...Tuuut...");
    }
}

class InheritedCar extends Inheritance_Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {

        InheritedCar myCar = new InheritedCar(); // myCar obj

        myCar.honk(); // calling honk() form Vehicle on myCarn obj

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}