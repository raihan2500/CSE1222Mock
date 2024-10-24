package q1;

public class Test {
    public static void main(String[] args) {

        Worker worker = new Worker("Bulbul", 250);
        Supervisor supervisor = new Supervisor("Shafi", 500, "Managing");
        Director director =  new Director("Tamzid", 1000, "Managing");

        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}
