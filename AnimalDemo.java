import java.util.Scanner;

// Base class
class Animal {
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Common method
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class Dog
class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    void displayDog() {
        display();
        System.out.println("Breed: " + breed);
    }
}

// Derived class Cat
class Cat extends Animal {
    String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }

    void displayCat() {
        display();
        System.out.println("Color: " + color);
    }
}

// Main class
public class AnimalDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dog input
        System.out.println("Enter Dog Details");
        System.out.print("Name: ");
        String dogName = sc.nextLine();

        System.out.print("Age: ");
        int dogAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Breed: ");
        String breed = sc.nextLine();

        // Cat input
        System.out.println("\nEnter Cat Details");
        System.out.print("Name: ");
        String catName = sc.nextLine();

        System.out.print("Age: ");
        int catAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Color: ");
        String color = sc.nextLine();

        Dog dog = new Dog(dogName, dogAge, breed);
        Cat cat = new Cat(catName, catAge, color);

        System.out.println("\nDog Details");
        dog.displayDog();

        System.out.println();
        dog.makeSound();

        System.out.println("\nCat Details");
        cat.displayCat();

        System.out.println();
        cat.makeSound();

        // Polymorphism
        System.out.println("\nDemonstrating Polymorphism");

        Animal[] animals = {dog, cat};

        for (Animal animal : animals) {
            animal.makeSound();
        }

        sc.close();
    }
}