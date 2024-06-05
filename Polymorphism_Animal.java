class Polymorphism_Animal {
    public void animalSound(){
        System.out.println("Animal makes sound");
    }
}

class Tiger extends Polymorphism_Animal{
    public void animalSound(){
        System.out.println("Tiger roars");
    }
}

class Cat extends Polymorphism_Animal{
    public void animalSound(){
        System.out.println("Cat says meow meow");
    }
}

class driver {
    public static void main(String[] args) {
        Polymorphism_Animal myAnimal = new Polymorphism_Animal();
        Tiger myTiger = new Tiger();
        Cat myCat = new Cat();

        myAnimal.animalSound();
        myTiger.animalSound();
        myCat.animalSound();
    }
}
