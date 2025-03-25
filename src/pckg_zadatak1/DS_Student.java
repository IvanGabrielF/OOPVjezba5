package pckg_zadatak1;

public class DS_Student extends Student{


    public DS_Student(String name){
        super(name);
    }
    @Override
    protected void completedStudy(int year) {
        System.out.println("Student has finished " + year + " of DS");

    }

    @Override
    protected void infoStudent() {
        super.infoStudent();
        System.out.println("Graduate");
    }
}
