public class App {

    public static void main(String[] args) {
        Animal lion1 = new Lion();
        Lion leg1 = new Lion();
        Lion eye1 = new Lion();

        System.out.println(lion1.getName());
        System.out.println("total legs : " + leg1.Legs(4));
        System.out.println("total legs : " + eye1.Eyes(2));

    }
}