public class Fahrzeug { // todo Ueberlegung zu dem Klassenname. Fahrzeug als abstrakte Klasse definieren. Eine neue Auto-Klasse und die bestehende Lkw-Klasse extenden Fahrzeug
    private String kennzeichen;
    private String marke;
    private String farbe;
    private float verbrauch;
    private float kw;
    private int kmStand;
    private double maxTankinhalt;
    private double aktTankinhalte;

    public Fahrzeug(String sign, String brand, String color, float drain, float kw, int kmStatus, double maxTank, double aktTank) {
        this.kennzeichen = sign;
        this.marke = brand;
        this.farbe = color;
        this.verbrauch = drain;
        this.kw = kw;
        this.kmStand = kmStatus;
        this.maxTankinhalt = maxTank;
        this.aktTankinhalte = aktTank;
    }

    public Fahrzeug() {
    }
    public String getKennzeichen() {
        return kennzeichen;
    }
    public String getMarke() {
        return marke;
    }
    public String getFarbe() {
        return farbe;
    }
    public float getVerbrauch() {
        return verbrauch;
    }
    public float getKw() {
        return kw;
    }
    public int getKmStand() {
        return kmStand;
    }

    public double getMaxTankinhalt() {
        return maxTankinhalt;
    }
    public double getAktTankinhalte() {
        return aktTankinhalte;
    }
    public void ausgabe() {
        System.out.println("Kennzeichen: "+this.kennzeichen);
        System.out.println("Marke: "+this.marke);
        System.out.println("Farbe: "+this.farbe);
        System.out.println("Verbrauch: "+this.verbrauch);
        System.out.println("kw: "+this.kw);
        System.out.println("Kilometerstand: "+this.kw);
        System.out.println("Tankinhalt max: "+this.maxTankinhalt);
        System.out.println("Tankinhalt akt: "+this.aktTankinhalte);
    }
}
