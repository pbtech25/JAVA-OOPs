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
   | public | class is accessible by any other class | public class Main { } |
   | private | class is accessible only within declared class | public class Main { } |
   | default | class is accessible by classes in the same package | public class Main { } |
   | protected | class is accessible by same package and subclasses | public class Main { } |

### Non Access Modifiers

![Local Image](./ASSETS/IMAGES/Non%20access%20kodifiers.png)
![Local Image](./ASSETS/IMAGES/Non%20access%20modifiers%20for%20methods.png)
