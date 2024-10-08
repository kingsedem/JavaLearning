public class Dog extends Animal{

    public Dog(String name){
        super(name);  //Super keyword invokes the constructor of your parent (Animal).
        System.out.println("Dog Constructor invoked");
    }
    public void walk(){
        System.out.println("Animal is walking!");
    }
}
