public class Tier {
    private String name;
    private int alter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void gibLaut(){}

    public void zeigeInfo(int alter,String name){
        System.out.println(alter + name);
    }

}
