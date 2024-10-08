public class Animal {
    String name;

    /*
    //Default Constructor
    public Animal(){
      }
     */


    //Custom constructor
    public Animal(String name){
        System.out.println("Animal Constructor invoked");
        this.name = name;
    }

    private void eat(){
        System.out.println(name + " Animal is eating!");
    }
}
