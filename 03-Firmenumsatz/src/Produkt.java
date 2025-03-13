public class Produkt {

    private String bezeichnung;
    private double preis;
    private int verkaufsmenge;

    public Produkt(String name, double price, int amount) {
        this.bezeichnung = name;
        this.preis = price;
        this.verkaufsmenge = amount;
    }

    public String produktAnzeige(){
        return "\t-" + bezeichnung + ": Preis " + preis + "€, Verkaufsmenge " + verkaufsmenge;
    }
    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getVerkaufsmenge() {
        return verkaufsmenge;
    }

    public void setVerkaufsmenge(int verkaufsmenge) {
        this.verkaufsmenge = verkaufsmenge;
    }

}
