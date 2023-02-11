package ProblemA;

public class Cat extends Mammal{

    Cat(String name) {
        super(name);
    }

    public void greets(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "ProblemA.Cat["+super.toString()+"]";
    }
}
