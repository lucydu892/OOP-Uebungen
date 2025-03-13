public class Kunde {

    private int kundenNr;
    private String kundenName;
    private Betreuer kundenBetreuer;
    private double kundenUmsatz;
    private double kundenOffen;

    public Kunde(int customerNr,String customerName,double customerRevenue,double customerOpen){
        this.kundenNr = customerNr;
        this.kundenName = customerName;
        this.kundenUmsatz = customerRevenue;
        this.kundenOffen = customerOpen;
    }

    public int getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(int kundenNr) {
        this.kundenNr = kundenNr;
    }

    public String getKundenName() {
        return kundenName;
    }

    public void setKundenName(String kundenName) {
        this.kundenName = kundenName;
    }

    public Betreuer getKundenBetreuer() {
        return kundenBetreuer;
    }

    public void setKundenBetreuer(Betreuer kundenBetreuer) {
        this.kundenBetreuer = kundenBetreuer;
    }

    public double getKundenUmsatz() {
        return kundenUmsatz;
    }

    public void setKundenUmsatz(double kundenUmsatz) {
        this.kundenUmsatz = kundenUmsatz;
    }

    public double getKundenOffen() {
        return kundenOffen;
    }

    public void setKundenOffen(double kundenOffen) {
        this.kundenOffen = kundenOffen;
    }
    public void kundeBezahlt(){}
}
