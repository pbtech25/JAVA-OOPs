import java.util.Scanner; //java.util is pkg, Scanner is class of java.util pkg

//import java.util.*; 

public class PackagesNAPIs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //obj 'sc' of Scanner class

        System.out.print("Enter your full name: ");
        String name  = sc.nextLine(); 

        System.out.println("Your name is : " + name);



        sc.close();
    }
}
