public class Main {
    public static void main(String[] args) {
        OOP myObj1 = new OOP();
        System.out.println(myObj1.x + 1);

        // modifying attributes
        myObj1.x = 40;
        System.out.println(myObj1.x);

        // myObj1.y = 20; //cannot override final int y
        /*
         * The final keyword is useful when you want a variable to always store the same
         * value, like PI (3.14159...).
         */

        // MULTIPLE OBJECTS
        OOP myObj2 = new OOP();
        myObj2.x = 25; // can modify indi. obj. w/o affecting other object
        System.out.println("Multiple objects: " + myObj1.x); // can modify indi. obj. w/o affecting other
        System.out.println("Multiple objects: " + myObj2.x);

        // MULTIPLE ATTRIBUTES
        OOP firstName = new OOP();
        OOP lastName = new OOP();
        OOP myAge = new OOP();
        System.out.println("(Using multiple attributes) \nMy Name is " + firstName.fName + " " + lastName.lName + ". " + "I am " + myAge.age + " years old.");

        

    }
}