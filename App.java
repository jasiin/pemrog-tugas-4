public class App {

    public static void main(String[] args) {
        Animal lion1 = new Lion();
        Lion total = new Lion();

        System.out.println(lion1.getName());
        System.out.println("speed : " + total.Total(50) + " miles per hours");
        System.out.println("weight : " + total.Total(40.2) + " Kg");
    }
}