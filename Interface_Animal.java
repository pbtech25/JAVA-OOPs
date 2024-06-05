//Interface

interface Interface_Animal {
    public void animlasSound(); //interface method donot have a body
    public void sleeep(); //interface method donot have a body
}


//Tiger3 implements Interface_Animal
class Tiger3 implements Interface_Animal{

    //body of animlasSound
    public void animlasSound(){
        System.out.println("Tiger roarrzzzzsszzzz.....");
    }

    //body of sleeep
    public void sleeep(){
        System.out.println("ZZZZSSSSSSSZzzzzzzz....");
    }
}

class Interface_Driver {
    public static void main(String[] args) {
        Tiger3 myTiger3 = new Tiger3();

        myTiger3.animlasSound();
        myTiger3.sleeep();
    }
}
