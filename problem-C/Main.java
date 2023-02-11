package ProblemC;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Adilbek", "Pushkina 5");
        System.out.println(person1);
        Student student1 = new Student("Asylbek", "Lenina 4", "bachelor", 2020, 2000);
        System.out.println(student1);
        Stuff staff1 = new Stuff("Aigul", "Abay 12", "smth", 4000);
        System.out.println(staff1);

    }
}
