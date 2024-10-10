public class Main {
    public static void main(String[] args) {

        Nadador n1 = new Nadador();
        Corredor cr1 = new Corredor();
        Ciclista cl1 = new Ciclista();

        n1.treinar();
        System.out.println(" ");

        cr1.colocarEquipamento();
        cr1.treinar();
        System.out.println(" ");

        cl1.colocarEquipamento();
        cl1.treinar();
    }
}