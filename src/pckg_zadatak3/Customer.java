package pckg_zadatak3;

public class Customer {
    private String name;
    private int idCustomer;
    private static int cntCustomer = 10;

    public Customer(String name){
        this.name=name;
        this.idCustomer=cntCustomer++;

    }
    public void customerInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
