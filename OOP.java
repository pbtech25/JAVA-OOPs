public class OOP {
    int x = 5;
    final int y = 10; // cannot modify the value of y due to final keyword

    String fName = "Prathamesh";
    String lName = "Bhosale";
    int age = 22;

    // JAVA METHODS
    // static methods - can be called w/o making objects
    static void printHello() {
        System.out.println("Static - Hello World");
    }

    // public methods - need to make object to be able to be called
    public void publicPrintHello() {
        System.out.println("Public - Hello World");
    }


    //ACCESS METHODS WITH OBJECT
    public void fullThrottle(){
        System.out.println("(Accesed method w/ obj) The car is going as fast as it can!");
    }
    public void speed(int maxSpeed){
        System.out.println("(Accesed method w/ obj) The car can go up to " + maxSpeed + " mph!!");
    }

    //CONSTRUCTORS
    int z ;
    public OOP(){ //creating class constructor for OOP class
        z = 20; //initialised z in constructor
    }
}