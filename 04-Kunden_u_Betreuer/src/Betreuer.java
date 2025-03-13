public class Betreuer {

    private int betreuerNr;
    private String betreuerName;
    private double betreuerProvision;

    public Betreuer(int carerNr,String carerName,double carerProvision){
        this.betreuerNr = carerNr;
        this.betreuerName = carerName;
        this.betreuerProvision = carerProvision;
    }

    public int getBetreuerNr() {
        return betreuerNr;
    }

    public void setBetreuerNr(int betreuerNr) {
        this.betreuerNr = betreuerNr;
    }

    public String getBetreuerName() {
        return betreuerName;
    }

    public void setBetreuerName(String betreuerName) {
        this.betreuerName = betreuerName;
    }

    public double getBetreuerProvision() {
        return betreuerProvision;
    }

    public void setBetreuerProvision(double betreuerProvision) {
        this.betreuerProvision = betreuerProvision;
    }

    public void betreuerProvision(){}
}
