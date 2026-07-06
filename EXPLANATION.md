# Explanation of Java Concepts Used

## Objective

This program demonstrates the concepts of **Inheritance** and **Polymorphism** in Java by creating a base class `Animal` and two derived classes, `Dog` and `Cat`.

---

# 1. Class

A class is a blueprint for creating objects.

Example:

```java
class Animal
```

The `Animal` class contains common properties and methods shared by all animals.

---

# 2. Base Class (Superclass)

The `Animal` class is the superclass.

It contains:

- Name
- Age
- Constructor
- makeSound() method
- display() method

```java
class Animal
```

---

# 3. Inheritance

Inheritance allows one class to acquire the properties and methods of another class.

Syntax:

```java
class Dog extends Animal
```

```java
class Cat extends Animal
```

Both `Dog` and `Cat` inherit the `name`, `age`, and `display()` method from the `Animal` class.

---

# 4. Constructor

The constructor initializes object values.

```java
Animal(String name, int age)
```

The derived classes call the superclass constructor using:

```java
super(name, age);
```

---

# 5. Method Overriding

Both derived classes override the `makeSound()` method.

Dog:

```java
@Override
void makeSound() {
    System.out.println(name + " says: Woof! Woof!");
}
```

Cat:

```java
@Override
void makeSound() {
    System.out.println(name + " says: Meow! Meow!");
}
```

This allows each class to provide its own implementation.

---

# 6. Polymorphism

Polymorphism allows one reference type to refer to different object types.

Example:

```java
Animal[] animals = {dog, cat};
```

Even though the array type is `Animal`, each object calls its own overridden `makeSound()` method.

```java
for (Animal animal : animals) {
    animal.makeSound();
}
```

Output:

```
Bruno says: Woof! Woof!
Kitty says: Meow! Meow!
```

This is **runtime polymorphism**.

---

# 7. Scanner Class

Used to accept user input.

```java
Scanner sc = new Scanner(System.in);
```

Methods used:

- `nextLine()`
- `nextInt()`

---

# 8. Objects

Objects are created from classes.

```java
Dog dog = new Dog(...);
Cat cat = new Cat(...);
```

Each object stores its own data.

---

# 9. Display Methods

The program displays object information using methods.

```java
displayDog();
displayCat();
```

---

# 10. Closing the Scanner

```java
sc.close();
```

This releases system resources after input is complete.

---

# Program Flow

1. Create the `Animal` base class.
2. Create the `Dog` and `Cat` classes using inheritance.
3. Override the `makeSound()` method in both derived classes.
4. Read user input.
5. Create `Dog` and `Cat` objects.
6. Display their details.
7. Call the overridden `makeSound()` methods.
8. Store both objects in an `Animal` array.
9. Demonstrate polymorphism by calling `makeSound()` through the `Animal` reference.
10. Close the Scanner.

---

# Java Concepts Covered

- Classes
- Objects
- Inheritance
- Superclass and Subclass
- Constructors
- `super` Keyword
- Method Overriding
- Runtime Polymorphism
- Arrays of Objects
- Scanner Class
- User Input
- Enhanced `for` Loop
- Output Statements
- Resource Management (`sc.close()`)
