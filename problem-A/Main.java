package ProblemA;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("ProblemA.Animal");
        System.out.println(animal);
        Mammal monkey = new Mammal("Monkey");
        System.out.println(monkey);
        Dog dog = new Dog("Mercy");
        System.out.println(dog);
        dog.greets();
        dog.greets(new Dog("saadasd"));
    }
}
