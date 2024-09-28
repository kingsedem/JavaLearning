public class ConditionalStatementDemoSwitch {

    public static void main(String[] args) {

        ConditionalStatementDemoSwitch conditionalStatementDemoSwitch = new ConditionalStatementDemoSwitch();
        conditionalStatementDemoSwitch.switchDemo(18);

    }
    public void switchDemo(int age){
        switch (age){
            case 18: {
                System.out.println("You are an adult");
                break;
            }
            case 60 : {
                System.out.println("You are a senior citizen");
                break;
            }
            default:{
                System.out.println("You are young");
                break;
            }
        }
    }
}
