public class Buchung {
    private int buchungsNr;
    private String gebuchtKennzeichen;
    private int dauer;

    public Buchung(int reservationNr,String sign,int duration) {
        this.buchungsNr = reservationNr;
        this.gebuchtKennzeichen = sign;
        this.dauer = duration;
    }

    public void setBuchungsNr(int buchungsNr) {
        this.buchungsNr = buchungsNr;
    }

    public int getBuchungsNr() {
        return buchungsNr;
    }

    public void setGebuchtKennzeichen(String gebuchtKennzeichen) {
        this.gebuchtKennzeichen = gebuchtKennzeichen;
    }

    public String getGebuchtKennzeichen() {
        return gebuchtKennzeichen;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    public int getDauer() {
        return dauer;
    }
}
