import ProblemA.Animal;
import ProblemA.Dog;
import ProblemA.Mammal;
import ProblemB.Circle;
import ProblemB.Rectangle;
import ProblemB.Square;
public class Check {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5, "red", false);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        System.out.println(circle.getRadius());
        Rectangle rectangle = new Rectangle(3.8, 2.5, "green", false);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getLength());
        Square square = new Square(6.6);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getColor());
        System.out.println(square.getSide());
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
