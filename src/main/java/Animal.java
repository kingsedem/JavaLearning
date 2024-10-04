public class Animal {

   private String name;
    public int id;

//    public Animal(){  //This is the default constructor set by JAVA when we don't set anyone ourselves
//
//    }

    public Animal(String  animalName, int animalId){  //Constructor with inputs
     name = animalName;
     id = animalId;
    }

    public void getDetails(){
        System.out.println("Name is "+ name+", id is: "+id);
    }

}
