public class auto1 {
    public static void main(String[] args) {

        Auto a1 = new Auto("GI-JP 111", "Renault", "rot", 6.2F, 90, 32500, 60, 32);
        Auto a2 = new Auto("GI-VH-200", "VW", "schwarz", 7.5F, 75, 65000, 50, 40);

        System.out.println("\nAusgabe a1");
        a1.ausgabe();
        System.out.println("\nAusgabe a2");
        a2.ausgabe();


    }
}
