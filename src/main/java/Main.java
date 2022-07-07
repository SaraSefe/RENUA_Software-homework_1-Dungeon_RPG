public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard(1, "aaa", 100 ,true);
        wizard.attack(wizard);
    }
}