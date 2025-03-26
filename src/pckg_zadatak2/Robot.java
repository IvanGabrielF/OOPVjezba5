package pckg_zadatak2;

public class Robot implements CommonActions{

    private String name;
    private int id;
    private static int cnt = 100;

    public Robot(String name){
        this.name=name;
        this.id = cnt+=100;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setCnt(int cnt) {
        Robot.cnt = cnt;
    }

    @Override
    public void walk(String s, int n) {
        System.out.println("Walking " + s + " distance " + n + " kilometers");



    }

    @Override
    public void talk(String s) {
        System.out.println( "This robot can't speak!");

    }

    @Override
    public void think(String s) {
        System.out.println("Thinking..." + s);

    }

    @Override
    public int calculate(int c) {
        if (c<=1){
            return 1;

        }else {
            return c * calculate(c - 1);
        }
    }
    public void infoRobot(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
