class Animal{

    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}


class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Cat makes a sound");
    }
}


class Vechile{

    public void drive(){
        System.out.println("drive vechile");
    }
}

class Car extends Vechile{

    @Override
    public void drive(){
        System.out.println("drive car");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.makeSound();
        cat.makeSound();
        Vechile vechile = new Vechile();
        Car car = new Car();
        vechile.drive();
        car.drive();
    }
}