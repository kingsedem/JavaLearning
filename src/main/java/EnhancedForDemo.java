public class EnhancedForDemo {

    public static void main(String[] args) {

        Animal lion = new Animal("lion");
        Animal tiger = new Animal("tiger");
        Animal fox = new Animal("fox");

        Animal[] animals = new Animal[]{lion, tiger, fox};

        for (Animal an: animals){
            System.out.println("Name of animal is :"+ an.name);
        }

//        String[] names = new String[]{"Abigail", "Kelvin", "Ben", "Victor", "Sandra"};
//
//        int[] employeeId = {3, 56, 54};


       // Regular for loop
//        for(int i=0; i < names.length; i++){
//            System.out.println("Index at POS: "+ i +" is:"+ names[i]);
//        }



        //Enhanced forloop
//        for(String n: names){
//            System.out.println(n);
//        }

//        for (int id : employeeId){
//            System.out.println("Employee id is: "+ id);
//        }
    }

}
