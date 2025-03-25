package pckg_zadatak1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Student {
    
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    protected Date enrolmentDate;
    protected String name;
    protected int idStudent;
    protected static int cntStudents = 10;
    private Scanner scanner = new Scanner(System.in);

    protected Student (String name){
        this.name=name;
        this.idStudent=cntStudents;

    }
    public void setScanner(Scanner scanner){
        this.scanner = scanner;
    }



    protected void setEnrolmentDate() throws ParseException {
        System.out.println("Please enter enrollment date (dd/MM/yyyy): ");
        String datum = scanner.nextLine();
        this.enrolmentDate = DATE_FORMAT.parse(datum);


    }
    public  void  setScanner() throws ParseException {
        System.out.println("Please enter enrollment data in format  dd/MM/yyyy: ");
        String dat = scanner.nextLine();
        this.enrolmentDate = DATE_FORMAT.parse(dat);

    }

    protected void infoStudent(){
        System.out.println(this);

    }

    protected abstract void completedStudy(int year);

    @Override
    public String toString() {
        return "Student{" +
                "enrolmentDate=" + enrolmentDate +
                ", name='" + name + '\'' +
                ", idStudent=" + idStudent +
                ", scanner=" + scanner +
                '}';
    }
}
