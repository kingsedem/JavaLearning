package pkg2;

public class Jungle {

    public static void main(String[] args) {
       Animal dog = new Dog();  //Instance of child - dog, is assigned to the parent - pkg2.Animal (Upcasting).
        Animal cat = new Cat();

        dog.eat();
        dog.walk();

        cat.walk();
        cat.eat();


    }
}
