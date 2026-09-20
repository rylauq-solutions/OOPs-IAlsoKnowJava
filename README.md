# OOPs-IAlsoKnowJava

A Java project demonstrating the four pillars of Object-Oriented Programming (OOP): **Inheritance, Encapsulation, Polymorphism, and Abstraction**. This project provides practical examples to highlight the application of OOP principles in real-world scenarios and best practices in Java programming and Object-Oriented Design.

---

## Key Concepts

### 📌 Inheritance
Inheritance allows a class to inherit properties and methods from another class using the `super()` keyword. It represents an **IS-A** relationship, where the child class is a type of the parent class.  
Inheritance promotes *code reusability*, *reduces redundancy*, and *improves maintainability* and *scalability*, making it a fundamental concept in object-oriented programming.  

**Types of Inheritance Demonstrated:**
- **Single-Level Inheritance**: A child class inherits directly from a parent class.
- **Multilevel Inheritance**: A class inherits from another derived class, creating a chain of inheritance.
- **Hierarchical Inheritance**: Multiple child classes inherit from a common parent class.
- **Hybrid Inheritance**: A combination of multilevel and hierarchical inheritance, creating a more complex structure.

### 📌 Encapsulation
Encapsulation is the concept of wrapping data (variables) and methods together into a single unit called a **class**. It restricts direct access to data and allows controlled access through public methods (getters and setters).  
Encapsulation *ensures data integrity*, *prevents unauthorized access*, and *enhances modularity* by keeping data hidden from external modification while allowing controlled interaction through defined methods.  

### 📌 Polymorphism
Polymorphism allows objects to take on multiple forms by enabling a single interface to be used for different types.  
Polymorphism enhances *flexibility*, *reusability*, and *maintainability* by allowing the same method to behave differently based on context. Method overloading *improves readability*, while method overriding enables *customization*. Upcasting supports *runtime flexibility*, making code more *modular* and *scalable*.

**Types of Polymorphism Demonstrated:**

#### a) Compile-Time Polymorphism
- **Constructor Overloading & Chaining**: Defining multiple constructors with different parameters and reusing them via `this()` or `super()`.
- **Method Overloading**: Defining multiple methods with the same name but different parameters in the same class.

#### b) Runtime Polymorphism
- **Method Overriding**: A subclass redefines a method from its parent class to provide a specific implementation.
- **Upcasting**: Assigning a child class object to a parent class reference, enabling dynamic method dispatch.

### 📌 Abstraction  
Abstraction hides implementation details and exposes only essential features. It can be achieved using *abstract classes* and *interfaces*.  
Abstraction simplifies code complexity by hiding implementation details and exposing only essential features. It enhances *security*, *reduces dependencies*, and *promotes modular design*. By using abstract classes and interfaces, it enables *flexible* and *scalable architectures*, ensuring better code *maintainability* and *reusability*.  

**Types of Abstraction Demonstrated:**  

#### a) Abstract Class  
- Abstract Class cannot be instantiated; may have both abstract and concrete methods.  

#### b) Interface  
- Interface defines a contract that a class must follow.  
   - **Normal Interface:** Contains multiple abstract methods.  
   - **Functional Interface:** Has exactly one abstract method, enabling lambda expressions (e.g., `Runnable`).  

---

## Project Structure

### **1) Inheritance**  

#### **a) Single-Level Inheritance**  
A child class inherits directly from a parent class.  
```
Loan.java (Parent Class)  
  └── PersonalLoan.java (Child Class - extends Loan)  
```

#### **b) Hybrid Inheritance (Multilevel + Hierarchical)**  
A complex structure combining multilevel and hierarchical inheritance.  
```
Product.java (Parent Class)  
  ├── Shirt.java (Child Class - extends Product)  
  ├── Laptop.java (Child Class - extends Product)  
          └── Mobile.java (Child Class - extends Laptop)  
```
### 2) Encapsulation
#### User/UserDriver Class
- **Private Fields:** `name`, `id`
- **Getter/Setter Methods:**  
  - `getName()`, `setName(String name)`
  - `getId()`, `setId(int id)`

#### Laptop/LaptopDriver Class
- **Private Fields:** `name`, `storage`
- **Getter/Setter Methods:**  
  - `getName()`, `setName(String name)`
  - `getStorage()`, `setStorage(int storage)`

#### Vehicle/VehicleDriver Class
- **Private Fields:** `name`, `price`
- **Getter/Setter Methods:**  
  - `getName()`, `setName(String name)`
  - `getPrice()`, `setPrice(double price)`

### 3) Polymorphism
#### (a) Compile-Time Polymorphism
- **constructor_overloading_chaining/**
  - **Fruit.java**, **Weapon.java**, **Laptop.java** → Demonstrates constructor overloading and chaining.
- **method_overloading/**
  - **Fruit.java**, **Weapon.java**, **Laptop.java** → Implements method overloading with multiple parameter variations.

#### (b) Runtime Polymorphism
- **method_overriding/**
  - **Fruit -> FruitMango**, **Laptop -> GamingLaptop**, **Weapon -> WeaponSword** → Override the `toString()` and `equals()` methods.
- **upcasting/**
  - **Fruit -> FruitMango**, **Laptop -> GamingLaptop**, **Weapon -> WeaponSword** → Demonstrates upcasting for dynamic method dispatch.
 
### 4) Abstraction  
#### **(a) Abstract Class**  
- **Vehicle.java** *(Abstract Class)* → **Car.java** *(Abstract Class - extends Vehicle)* → **ElectricCar.java** *(Concrete Class - extends Car)* → **Driver.java**  
#### **(b) Interfaces**  
- **normal_interface/**  
  - **Vehicle.java** *(Interface)* → **Car.java** *(Implements Vehicle)* → **ElectricCar.java** *(Implements Additional Methods)* → **Driver.java**  
- **functional_interface/**  
  - **Car.java** *(Implements Runnable - Functional Interface)* → **CarDriver.java** *(Executes Runnable Implementation)*  
