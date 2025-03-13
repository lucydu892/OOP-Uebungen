public class Auto {
    private String Kennzeichen;
    private String Marke;
    private String Farbe;
    private float Verbrauch;
    private float kw;
    private int kmStand;
    private double maxTankinhalt;
    private double aktTankinhalte;

    public Auto(String sign, String brand, String color, float drain, float kw, int kmStatus, double maxTank, double aktTank) {
        this.Kennzeichen = sign;
        this.Marke = brand;
        this.Farbe = color;
        this.Verbrauch = drain;
        this.kw = kw;
        this.kmStand = kmStatus;
        this.maxTankinhalt = maxTank;
        this.aktTankinhalte = aktTank;
    }

    public Auto() {
    }

    public void setKennzeichen(String kennzeichen) {
        Kennzeichen = kennzeichen;
    }
    public String getKennzeichen() {
        return Kennzeichen;
    }

    public void setMarke(String marke) {
        Marke = marke;
    }

    public String getMarke() {
        return Marke;
    }

    public void setFarbe(String farbe) {
        Farbe = farbe;
    }

    public String getFarbe() {
        return Farbe;
    }

    public void setVerbrauch(float verbrauch) {
        Verbrauch = verbrauch;
    }

    public float getVerbrauch() {
        return Verbrauch;
    }

    public void setKw(float kw) {
        this.kw = kw;
    }

    public float getKw() {
        return kw;
    }

    public void setKmStand(int kmStand) {
        this.kmStand = kmStand;
    }

    public int getKmStand() {
        return kmStand;
    }

    public void setMaxTankinhalt(double maxTankinhalt) {
        this.maxTankinhalt = maxTankinhalt;
    }

    public double getMaxTankinhalt() {
        return maxTankinhalt;
    }

    public void setAktTankinhalte(double aktTankinhalte) {
        this.aktTankinhalte = aktTankinhalte;
    }

    public double getAktTankinhalte() {
        return aktTankinhalte;
    }
    public void ausgabe() {
        System.out.println("Kennzeichen: "+this.Kennzeichen);
        System.out.println("Marke: "+this.Marke);
        System.out.println("Farbe: "+this.Farbe);
        System.out.println("Verbrauch: "+this.Verbrauch);
        System.out.println("kw: "+this.kw);
        System.out.println("Kilometerstand: "+this.kw);
        System.out.println("Tankinhalt max: "+this.maxTankinhalt);
        System.out.println("Tankinhalt akt: "+this.aktTankinhalte);
    }
}
