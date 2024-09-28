public class IfStatementAssignment {
    public static void main(String[] args) {
        IfStatementAssignment dataCheck = new IfStatementAssignment();
        dataCheck.getUserData(0, "Female");
    }

    public void getUserData(int age, String gender){

        if((age > 0) && (age < 18) && (gender == "Male")) {
            System.out.println("User is a boy");
        }else if((age > 0) && (age < 18) && (gender == "Female")) {
            System.out.println("User is a girl");
        }else if((age>=18) && (age <60) && (gender == "Male")){
            System.out.println("User is a Man");
        }else if((age>=18) && (age <60) && (gender == "Female")){
            System.out.println("User is a Woman");
        }
        else if(age>=60){
            System.out.println("User is a Senior Citizen");
        }
        else {
            System.out.println("Please learn more about ages!");
        }
    }
}
