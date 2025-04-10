package pckg_zadatak3;

import java.util.Scanner;

public class ClientApp {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Customer customer = new Customer("CUSTOMERKA");
        Payment payment = new Payment("Visa");
        Package pckg = new Package("WEBSH1","Zadar", customer,payment);
        pckg.packageInfo();
    }
}


