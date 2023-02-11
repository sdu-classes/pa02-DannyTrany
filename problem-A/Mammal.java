package ProblemA;

public class Mammal extends Animal{

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "ProblemA.Mammal["+super.toString()+"]";
    }
}
