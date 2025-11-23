// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make different sounds");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class to run the program
public class OOPExample {
    public static void main(String[] args) {
        Animal a = new Animal(); // Parent object
        a.sound();

        Dog d = new Dog(); // Child object
        d.sound();
    }
}
