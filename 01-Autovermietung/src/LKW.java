public class LKW extends Fahrzeug {

    private int maxLadegewicht;
    private int aktLadegewicht;

    public LKW(int maxLoadWeight, int aktLoadWeight) {
        this.maxLadegewicht = maxLoadWeight;
        this.aktLadegewicht = aktLoadWeight;
    }

    public int getMaxLadegewicht() {
        return maxLadegewicht;
    }
    public int getAktLadegewicht() {
        return aktLadegewicht;
    }
    public void ausgabe()
    {
        System.out.println("Maximales Gewicht: "+this.maxLadegewicht);
        System.out.println("Aktuelles Gewicht: "+this.aktLadegewicht);
    }
}
