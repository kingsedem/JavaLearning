public class DummyRun {

    public static void main(String[] args) {

        School sc1 = new School();
        sc1.name = "St Peters";
        sc1.address = "Rivers state";
        sc1.principal = "Mrs Abah";
        sc1.teacherCount = 30;
        sc1.studentCount = 400;


        Teacher t1 = new Teacher();
        t1.name = "Mr John";
        t1.subject = "Mathematics";

        Student s1 = new Student();
        s1.name = "King";
        s1.age = 34;

        Student s2 = new Student();
        s2.name = "Jack";
        s2.age = 31;


        Classroom c1 = new Classroom();
        c1.floorNumber = 2;
        c1.seatCount = 5;


    }
}
