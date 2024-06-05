interface FirstInterface {
    public void firstMethod();
}

interface SecondInterface {
    public void secondMethod();
}

class Method implements FirstInterface, SecondInterface{
    public void firstMethod(){
        System.out.println("First Method");
    }
    
    public void secondMethod(){
        System.out.println("Second Method");
    }
}

class Multiple_Interface_Driver {
    public static void main(String[] args) {
        Method myMethod = new Method();

        myMethod.firstMethod();
        myMethod.secondMethod();
    }
}
