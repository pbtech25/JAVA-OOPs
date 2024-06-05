# JAVA-OOPs

This repository documents my journey in learning Java Object-Oriented Programming (OOP). It includes examples, exercises, and projects covering key OOP concepts like classes, objects, inheritance, polymorphism, encapsulation, and abstraction. Each section aims to build a solid foundation for developing robust Java applications.

# My Coding (Java OOPs) Journey

Started coding on 03/06/2024

|    **DATE**    | **WORK**                   |
| :------------: | :------------------------- |
| **03/06/2024** | Started learning Java OOPs |
| **04/06/2024** |                            |

# Important Notes

## Remember that... 🧠

- The dot (.) is used to access the object's attributes and methods.
- To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).
- A class must have a matching filename (Main and Main.java).

## Java Constructor 🏗️

- special method, used to initialize objects.
- constructor name **must match the class name**, it cannot have a **return type** (like **void**).
- constructor is called **only** when the object is created.
- All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.
- can also take parameters, used to initialize attributes.

## Modifiers

We divide modifiers into two groups:

- **Access Modifiers** - controls the access level
- **Non-Access Modifiers** - do not control access level, but provides other functionality

### Access Modifiers

1. For **classes**:
   | **Modifier** | **Description** | **Example** |
   | :----------: | :------------------------------------------------------- | :-------------------- |
   | public | class is accessible by any other class | public class Main { } |
   | default | class is only accessible by classes in the same package. | class Main { } |

2. for **attributes, methods and constructors**:
   | **Modifier** | **Description** | **Example** |
   | :----------: | :------------------------------------------------------- | :-------------------- |
   | public | class is accessible by any other class | public int age = 24; |
   | private | class is accessible only within declared class | private int age = 24; |
   | default | class is accessible by classes in the same package | int age = 24; |
   | protected | class is accessible by same package and subclasses | protected int age = 24; |

### Non Access Modifiers

![Local Image](./ASSETS/IMAGES/Non%20access%20kodifiers.png)
![Local Image](./ASSETS/IMAGES/Non%20access%20modifiers%20for%20methods.png)

## Encapsulation
to make sure that "sensitive" data is hidden from users

### Get and Set Method
- private variables, an outside class has no access to it.
- it is possible to access them if we provide public get and set methods.
- The get method returns the variable value, and the set method sets the value.
- Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case
- The get method returns the value of the variable name.
- The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.

### Why Encapsulation?
- Better control of class attributes and methods
- Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increased security of data

## Packages & API
- to group related classes
- to avoid name conflicts
- to write a better maintainable code
- 2 parts: 
   - Built-in Packages (packages from the Java API)
   - User-defined Packages (create your own packages)

### Built in Packages
- Java API is a library of prewritten classes
- library is divided into **packages** and **classes**
- can either import a single class (along with its methods and attributes), or a whole package that contain all the classes
- To use a class --> need to use the **import** keyword
- To import a whole package, end the sentence with an asterisk sign (*)

### User-defined Packages
Java uses a file system directory to store them
- Save the file as MyPackageClass.java, and compile it:
C:\Users\Your Name>javac MyPackageClass.java
- Then compile the package:
C:\Users\Your Name>javac -d . MyPackageClass.java
- This forces the compiler to create the "mypack" package.
- The -d keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user (windows), or, if you want to keep the package within the same directory, you can use the dot sign ".", like in the example above.
- **Note**: The package name should be written in lower case to avoid conflict with class names.

## Java Inheritance
- possible to inherit attributes and methods from one class to another
   * subclass (child) - the class that inherits from another class
   * superclass (parent) - the class being inherited from

- We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.

- If you don't want other classes to inherit from a class, use the **final** keyword

## Interface
- Another way to achieve abstraction 
- interface is a completely "abstract class" that is used to group related methods with empty bodies
- To access interface methods, interface must be "implemented" by another class with the implements keyword (instead of extends). 
- The body of the interface method is provided by the "implement" class
- An interface cannot contain a constructor (as it cannot be used to create objects)
- Why And When To Use Interfaces?