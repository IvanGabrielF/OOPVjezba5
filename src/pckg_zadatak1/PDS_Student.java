package pckg_zadatak1;

public class PDS_Student extends Student{
    protected PDS_Student(String name) {
        super(name);
    }

    @Override
    protected void completedStudy(int year) {
        switch (year){
            case 1 -> System.out.println("First year");
            case 2 -> System.out.println("Second year");
            case 3 -> System.out.println("Third year");
            default -> System.out.println("Not a student");

        }

    }

    @Override
    protected void infoStudent() {
        super.infoStudent();
        System.out.println("Undergraduate");
    }
}
