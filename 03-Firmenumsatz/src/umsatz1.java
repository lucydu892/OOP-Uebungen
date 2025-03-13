public class umsatz1 {
    public static void main(String[] args) {

        //Initialize Produkt
        Produkt p1 = new Produkt("Saphir",20000,150);
        Produkt p2 = new Produkt("Smaragd",16500,220);
        Produkt p3 = new Produkt("Mammut",80000,30);
        //Initialize Werk
        Werk w1 = new Werk("Dortmund", p1);
        Werk w2 = new Werk("Essen", p2);
        Werk w3 = new Werk("Siegen", p3);
        //Calculate WerksUmsatz
        w1.berechnenWerksUmsatz();
        w2.berechnenWerksUmsatz();
        w3.berechnenWerksUmsatz();
        //Calculate FirmenUmsatz
        int firmenUmsatz = (int) (w1.getWerksUmsatz() + w2.getWerksUmsatz() + w3.getWerksUmsatz());
        //Print products
        System.out.println(p1.produktAnzeige());
        System.out.println(p2.produktAnzeige());
        System.out.println(p3.produktAnzeige());
        //Print FirmenUmsatz
        System.out.println(w1.umsatzAnzeige());
        System.out.println(w2.umsatzAnzeige());
        System.out.println(w3.umsatzAnzeige());

        System.out.println("Gesamt");
    }
}