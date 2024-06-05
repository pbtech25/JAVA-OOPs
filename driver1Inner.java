class OuterClass {
    int x = 10;

    class InnerClass {
        public int myInnerMethod(){
            return x;
        }
    }
}

public class driver1Inner {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }    
}
