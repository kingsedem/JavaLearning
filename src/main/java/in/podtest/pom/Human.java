package in.podtest.pom;

class Human {

    public String name = "Human";
    private int age = 45;

    Animal animal = new Animal();
    public void eat(){
        System.out.println("Human is eating");
    }

    private void getDetails(){
        System.out.println(name + " "+ age);
    }

}
