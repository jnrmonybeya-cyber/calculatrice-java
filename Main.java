public class Main {
    public static void main(String[] args) {
        calculatrice calc = new calculatrice();
        
        System.out.println("Addition: " + calc.addition(10, 5));
        System.out.println("Soustraction: " + calc.soustraction(10, 5));
        System.out.println("Multiplication: " + calc.multiplier(10, 5));
        System.out.println("Division: " + calc.diviser(5, 0));
        System.out.println("Racine carrée: " + calc.racineCarree(25));
    }
}
