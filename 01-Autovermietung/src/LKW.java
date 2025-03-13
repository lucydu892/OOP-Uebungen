public class LKW extends Auto{

    private int maxLadegewicht;
    private int aktLadegewicht;

    public LKW(int maxLoadWeight, int aktLoadWeight) {
        this.maxLadegewicht = maxLoadWeight;
        this.aktLadegewicht = aktLoadWeight;
    }

    public int getMaxLadegewicht() {
        return maxLadegewicht;
    }

    public void setMaxLadegewicht(int maxLadegewicht) {
        this.maxLadegewicht = maxLadegewicht;
    }

    public int getAktLadegewicht() {
        return aktLadegewicht;
    }

    public void setAktLadegewicht(int aktLadegewicht) {
        this.aktLadegewicht = aktLadegewicht;
    }

    public void beladen(int kg) {

        if (this.aktLadegewicht + kg < this.maxLadegewicht) {
            this.aktLadegewicht = this.aktLadegewicht + kg;
        }else {
            this.aktLadegewicht = this.maxLadegewicht;
        }
    }
    public void ausgabe()
    {
        System.out.println("Maximales Gewicht: "+this.maxLadegewicht);
        System.out.println("Aktuelles Gewicht: "+this.aktLadegewicht);
    }
}
