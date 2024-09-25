public class ConditionalStatementDemo {

    public static void main(String[] args) {
        ConditionalStatementDemo conditionalStatementDemo = new ConditionalStatementDemo();
        String result =  conditionalStatementDemo.getNameCategory(60);
        System.out.println(result);
    }

    //getNameCategory

    //age > 0 and age <18 : Child
    //age >= 18 and age < 60 : Adult
    //age >60 : Senior Citizen SC

    public String getNameCategory(int age){
        String ageCategory = null;

        if((age>0) && (age<18)){
            ageCategory = "Child";
            System.out.println("Age category is: " +ageCategory);
        } else if ((age>=18) && (age<60)){
            ageCategory = "Adult";
            System.out.println("Age category is: " +ageCategory);

        } else if (age>=60){
            ageCategory = "Senior Citizen";
            System.out.println("Age category is: " +ageCategory);

        }
        else {
            System.out.println("Please learn more about ages!");
        }
        return  ageCategory;
    }
}
