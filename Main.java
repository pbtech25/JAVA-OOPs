public class Main {
    public static void main(String[] args) {
        // OOP myObj1 = new OOP(); //creating object of OOP class
        // OOP myObj2 = new OOP(); //creating object of OOP class
        // OOP myObj3 = new OOP(); //creating object of OOP class
        //
        // myObj1.x = 40;
        // myObj2.x = 30;
        //
        // System.out.println(myObj1.x + 1);
        // System.out.println(myObj2.x+2);
        // System.out.println(myObj3.x+3);
        //
        // OOP myName = new OOP(); //creating object of OOP class
        //
        // System.out.println("Name: " + myName.fName + " " + myName.lName +
        // "\nAge: " + myName.age );
        //
        // OOP.myStaticMethod();
        //
        // OOP public_obj = new OOP();
        // public_obj.myPublicMethod();
        //
        // OOP myCar = new OOP(); //created object myCar
        // myCar.fullThrottle(); //called fullThrottle method
        // myCar.speed(200); //called speed method

        OOP myObj = new OOP("Range Rover", "Velar", 2024); // created object of class OOP
        System.out.println("Car name: " + myObj.name + "\nCar model: " + myObj.model + "\nPurchase Year: " + myObj.year);
    }
}