abstract class Abstraction_Animal { //abs class cannot have obj, have obj when inherited
    public abstract void animalSound(); //abs meth don't have body

    public void sleep(){
        System.out.println("Zzzzz....");
    }
}

//subclass of Abstraction_Animal
class Tiger2 extends Abstraction_Animal {

    //body of animalSound here
    public void animalSound(){
        System.out.println("Tiger roarrrsssss...");
    }
}

class AbsDriver {
    public static void main(String[] args) {
        Tiger2 myTiger = new Tiger2();

        myTiger.animalSound();
        myTiger.sleep();
    }
}

