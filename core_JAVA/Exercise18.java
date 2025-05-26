Inheritance Example:

class Animal { void makeSound() { System.out.println("Sound"); } }
class Dog extends Animal { void makeSound() { System.out.println("Bark"); } }
public class Main {
    public static void main(String[] args) {
        new Animal().makeSound(); new Dog().makeSound();
    }
}