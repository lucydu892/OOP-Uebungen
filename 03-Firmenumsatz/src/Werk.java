public class Werk {
    private String standort;
    private Produkt meinProdukte;
    private double werksUmsatz;

    public Werk(String location, Produkt produkt){
        this.standort = location;
        this.meinProdukte = produkt;
    }
    public String umsatzAnzeige(){
        return "Werk " + standort + ": Produkt " + meinProdukte.getBezeichnung() + ", " + werksUmsatz + " Euro";
    }
    public String getStandort() {
        return standort;
    }
    public void setStandort(String standort) {
        this.standort = standort;
    }

    public Produkt getMeinProdukte() {
        return meinProdukte;
    }
    public void setMeinProdukte(Produkt meinProdukte) {
        this.meinProdukte = meinProdukte;
    }

    public double getWerksUmsatz() {
        return werksUmsatz;
    }
    public void setWerksUmsatz(double werksumsatz) {
        this.werksUmsatz = werksumsatz;
    }

    public double berechnenWerksUmsatz(){
        this.werksUmsatz=this.getMeinProdukte().getPreis()*this.getMeinProdukte().getVerkaufsmenge();
        return this.werksUmsatz;
    }
}
