package org.example.ZooEcosystemSimulation;

public interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();
}
abstract class Animal implements AnimalBehavior{
    @Override
    public void eat() {
        System.out.println("Animal eats");
    }

    @Override
    public void sleep() {
        System.out.println("Animal sleeps");

    }

    @Override
    public void makeSound() {
        System.out.println("Animal make sound");

    }

    void displayInformation(){


    }
}
 class Mammal extends Animal{

     @Override
     public void eat() {
         super.eat();
     }

     @Override
     public void makeSound() {
         super.makeSound();
     }

     @Override
     void displayInformation() {
         super.displayInformation();
     }
 }
class Lion extends Mammal{
    @Override
    public void eat() {
        System.out.println("Lion can eat meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Lions snarls");
    }

    @Override
    void displayInformation() {
        System.out.println("Lions are a predatory animal that lives in a pack ");
    }
}
class Elephant extends Mammal{
    @Override
    public void eat() {
        System.out.println("Elephants eat grass,small plants and fruits");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephants make sound like trumpets and rumbles");
    }

    @Override
    void displayInformation() {
        System.out.println("Elephant is the largest animal, they've got thick skin");
    }
}
class Bird extends Animal{
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    void displayInformation() {
        super.displayInformation();
    }
}
class Parrot extends Bird{
    @Override
    public void eat() {
        System.out.println("Parrot eats fruits, vegetables, seeds, treats, and nuts");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrots makes sounds like talk, screech, squawk");
    }

    @Override
    void displayInformation() {
        System.out.println("Parrots also known as psittacines are birds with a strong curved beak, upright stance, and clawed feet.");
    }
}
class Eagle extends Bird{
    @Override
    public void makeSound() {
        System.out.println("Eagle eat meet");
    }

    @Override
    public void eat() {
        System.out.println("Eagles makes a series of high-pitched whistling or piping notes");
    }

    @Override
    void displayInformation() {
        System.out.println("Eagle is a beautiful big bird, a lot of national flags have eagles on it");
    }
}