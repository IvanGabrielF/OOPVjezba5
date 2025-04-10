package pckg_zadatak3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Package {
    private int idPackage;
    private static int cntPckg = 0;
    private String destination;
    private Customer customer;
    private float pricePackage;
    private int totalKom;
    private String webShop;
    private Scanner sc;
    private ArrayList<Item> items;

    private static final float MINI = 5f;
    private static final float MAXI = 200f;
    private static final int KOMS = 10;
    private String[] AllItems = {"Sneakers", "T-shirts", "Helmet", "Pants"};
    private Set<Payment> payments;

    public Package(String shop, String destination, Customer customer, Payment payment) {
        this.idPackage = cntPckg++;
        this.items = new ArrayList<>();
        this.payments = new HashSet<>();
        this.webShop = shop;
        this.destination = destination;
        this.customer = customer;
        this.payments.add(payment);
        this.sc = new Scanner(System.in);
    }

    public boolean checkPaymentPackage() {
        System.out.println("Please enter payment method ->");
        boolean status = false;
        String paymentMethod = sc.nextLine();
        for (Payment payment : payments) {
            if (payment.getPayment().equals(paymentMethod)) {
                status = true;
                break;
            }
        }
        return status;
    }

    private float randFloatPrice() {
        Random random = new Random();
        return MINI + random.nextFloat() * (MAXI - MINI);
    }

    private int randIntKom() {
        return ThreadLocalRandom.current().nextInt(1, KOMS);
    }

    public void sScanner(Scanner scanner) {
        this.sc = scanner;
    }

    @Override
    public String toString() {
        return "Paket{" +
                "idPackage=" + idPackage +
                ", destination='" + destination + '\'' +
                ", customer=" + customer +
                ", pricePackage=" + pricePackage +
                ", totalKom=" + totalKom +
                ", webShop='" + webShop + '\'' +
                ", items=" + items +
                '}';
    }

    public void packageInfo() {
        System.out.println(this);
    }

    private abstract class Item {
        abstract float itemPrice();
    }

    private class T_Shirt extends Item {
        float tshirtPrice;
        int komTshirt;

        T_Shirt(float price, int kom) {
            this.komTshirt = kom;
            this.tshirtPrice = price;
        }

        float getPrice() {
            return tshirtPrice;
        }

        int getKom() {
            return komTshirt;
        }

        @Override
        float itemPrice() {
            return komTshirt * tshirtPrice;
        }
    }

    private class Pants extends Item {
        float pantPrice;
        int komPant;

        Pants(float price, int kom) {
            this.komPant = kom;
            this.pantPrice = price;
        }

        float getPrice() {
            return pantPrice;
        }

        int getKom() {
            return komPant;
        }

        @Override
        float itemPrice() {
            return komPant * pantPrice;
        }
    }

    private class Helmet extends Item {
        float helmetPrice;
        int komHelmet;

        Helmet(float price, int kom) {
            this.helmetPrice = price;
            this.komHelmet = kom;
        }

        float getPrice() {
            return helmetPrice;
        }

        int getKom() {
            return komHelmet;
        }

        @Override
        float itemPrice() {
            return komHelmet * helmetPrice;
        }
    }

    private class Sneakers extends Item {
        float sneakersPrice;
        int komSneakers;

        Sneakers(float price, int kom) {
            this.komSneakers = kom;
            this.sneakersPrice = price;
        }

        float getPrice() {
            return sneakersPrice;
        }

        int getKom() {
            return komSneakers;
        }

        @Override
        float itemPrice() {
            return komSneakers * sneakersPrice;
        }
    }
}
