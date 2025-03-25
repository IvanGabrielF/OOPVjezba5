package pckg_zadatak1;

import java.text.ParseException;
import java.util.Scanner;

public class Client {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        PDS_Student student1 = new PDS_Student("Name-01");
        DS_Student student2 = new DS_Student("Name-02");
        student1.setScanner(scanner);
        student1.setEnrolmentDate();
        student1.completedStudy(3);
        student1.infoStudent();

        student2.setScanner(scanner);
        student2.setEnrolmentDate();
        student2.completedStudy(5);
        student2.infoStudent();



    }


}
