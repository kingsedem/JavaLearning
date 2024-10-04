public class ArrayDemo {

    public static void main(String[] args) {
        //Create the Array
        String[] studentNames = new String[3];

        //Set the array
        studentNames[1] = "Cynthia";
        studentNames[0] = "David";
        studentNames[2] = "Kay";

        String[] studentNames1 = new String[]{"Cynthia", "David", "Kay"};  //This is an alternative way of initializing and declaring your Array


        //Get the array
        System.out.println(studentNames[1]);
        System.out.println(studentNames1[2]);
    }
}
