public class Kunde {
    private int kundenNr;
    private String kundenVorname;
    private String kundenNachame;
    private Buchung meineBuchung;

    public Kunde(int customerNr, String customerFirstName, String customerLastName) {
        this.kundenNr = customerNr;
        this.kundenVorname = customerFirstName;
        this.kundenNachame = customerLastName;
    }

    public String getKundenVorname() {
        return kundenVorname;
    }

    public String getKundenNachame() {
        return kundenNachame;
    }

    public int getKundenNr() {
        return kundenNr;
    }

    public void buchen(int buchungsNr,String kennzeichen, int mietDauer){
        Buchung b1 = new Buchung(buchungsNr,kennzeichen,mietDauer); // todo was passiert hier?
    }

    public void setMeineBuchung(Buchung meineBuchung) {
        this.meineBuchung = meineBuchung;
    }

    public Buchung getMeineBuchung() {
        return meineBuchung;
    }
}
