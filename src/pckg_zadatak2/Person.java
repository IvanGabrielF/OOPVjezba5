package pckg_zadatak2;

import java.util.UUID;

public class Person implements CommonActions{

    private String name;
    private int id;
    private static int cnt = 10;

    public Person(String name){
        this.name=name;
        this.id = cnt+=10;

    }


    @Override
    public void walk(String s, int n) {
        System.out.println("I'm a human, and you can't command to me!");

    }

    @Override
    public void talk(String s) {
        System.out.println( "You want me to talk - ok: " + UUID.randomUUID().toString());


    }

    @Override
    public void think(String s) {
        System.out.println("Surely, humans are more capable of thinking then robots - aren't they?");


    }

    @Override
    public int calculate(int c) {
        return c%2;
    }
    public void infoPerson(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
